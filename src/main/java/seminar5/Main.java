package seminar5;


import seminar5.Controller.Controller;
import seminar5.Controller.IGetModel;
import seminar5.Controller.IGetView;
import seminar5.model.FileModel;
import seminar5.model.Model;
import seminar5.model.Student;
import seminar5.view.View;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students= new ArrayList<>();
        Student s1= new Student("Сергей","Иванов",22,101);
        Student s2= new Student("Андрей","Сидоров",22,111);
        Student s3= new Student("Иван","Петров",22,131);
        Student s4= new Student("Игорь","Иванов",23,143);
        Student s5= new Student("Даша","Цветкова",23,121);
        Student s6= new Student("Лена","Незабудкина",23,161);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        FileModel fileModel=new FileModel("test.txt");
        //fileModel.saveAllStudentToFile(students);


        IGetModel model =new Model(students);
        IGetModel newFModel=fileModel;
        IGetView view= new View();
        Controller controller=new Controller(view,model);
        Controller controller2=new Controller(view,newFModel);
        //controller.update();
        controller.run();
    }
}
