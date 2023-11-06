package seminar3_4;

import seminar3_4.studentControllers.EmploeeController;
import seminar3_4.studentDomen.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


       /* User u1= new User("Сергей","Иванов",25);
        Student s1= new Student("Сергей","Иванов",22,101);
        Student s2= new Student("Андрей","Сидоров",22,111);
        Teacher t1 =new Teacher(null,null,0,null,0);
        Teacher t2 =new Teacher(null,null,0,null,0);
        User u2  =new Student("Сергей","Иванов",22,101);
        User u3 =new Teacher(null,null,0,null,0);

       *//* PersonComparator1<Student1> compS = new PersonComparator1<Student1>();
        compS.compare(s1,s2);*//*

       *//* PersonComparator<Teacher> compT= new PersonComparator<Teacher>();
        compT.compare(t1,t2);*//*

        *//*PersonComparator<User>  compUser= new PersonComparator<User>();
        compUser.compare(u2,u3);*//*

        Student s3= new Student("Иван","Петров",22,131);
        Student s4= new Student("Игорь","Иванов",23,143);
        Student s5= new Student("Даша","Цветкова",23,121);
        Student s6= new Student("Лена","Незабудкина",23,161);

        List<Student>students= new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        StudentGroup studentGroup = new StudentGroup(students);

        Collections.sort(studentGroup.getStudents());

        for (Student student:studentGroup){
            System.out.println(student);
        }*/
       Emploeer per1=new Emploeer("Иван","Иванов",40);
       // EmploeeController emploeeController=new EmploeeController();
      //  emploeeController.paySalary(per1);
        EmploeeController.paySalary(per1);
    }
}
