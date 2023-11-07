package seminar5.view;

import seminar5.Controller.IGetView;
import seminar5.model.Student;

import java.util.List;
import java.util.Scanner;

public class View implements IGetView {

    public void printAllStudents(List<Student>students){
        for (Student stus:students) {
            System.out.println(stus);
        }
    }

    @Override
    public String prompt(String massage) {
        Scanner in = new Scanner(System.in);
        System.out.println(massage);
        return in.nextLine();
    }
}
