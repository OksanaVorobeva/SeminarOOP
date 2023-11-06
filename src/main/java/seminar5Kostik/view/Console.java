package seminar5Kostik.view;

import seminar5Kostik.presenter.Presenter;

import java.util.Scanner;

public class Console implements View{
    private Scanner scanner;
    private Presenter presenter;
    private boolean work = true;

    public Console() {
        this.scanner = new Scanner(System.in, "cp866");
    }

    public void print(String text) {
        System.out.println(text);
    }

    public void start() {
        while(this.work) {
            System.out.println("1 - добавить новую запись\n2 - вывести все на экран\n3 - завершить работу");
            switch (this.scanner.nextLine()) {
                case "1":
                    this.addRecord();
                    break;
                case "2":
                    this.viewAll();
                    break;
                case "3":
                    this.exit();
                    break;
                default:
                    System.out.println("Ошибка ввода");
            }
        }

    }

    private void addRecord() {
        System.out.println("Введите запись");
        String record = this.scanner.nextLine();
        this.presenter.addRecord(record);
    }

    private void viewAll() {
        this.presenter.getRecords();
    }

    private void exit() {
        System.out.println("Работа завершена");
        this.scanner.close();
        this.work = false;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}


