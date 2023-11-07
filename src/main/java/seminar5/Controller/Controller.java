package seminar5.Controller;

import seminar5.model.Model;
import seminar5.model.Student;
import seminar5.view.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private IGetView view;
    private IGetModel model;
    private List<Student>students;

    public Controller(IGetView view, IGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<>();
    }

    public void getAllStudent(){
        students=model.getAllStudents();
    }

    public boolean testData(){
        if(students.size()>0){
            return true;
        }else {return false;
        }
    }

    public void update(){
        //MVP
        getAllStudent();
        if(testData()){
            view.printAllStudents(students);
        }else {
            System.out.println("Список студентов пуст");
        }
        //MVC
       // view.printAllStudents(model.getAllStudents());
    }

    public  void  run(){
        Commands com=Commands.NONE;
        boolean getNewIteration=true;
        while (getNewIteration){
            String command=view.prompt("Введите команду: ");
            com=Commands.valueOf(command.toUpperCase());
            switch (com){
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы");
                    break;
                case LIST:
                    getAllStudent();
                    view.printAllStudents(students);
                    break;
            }
        }
    }
}
