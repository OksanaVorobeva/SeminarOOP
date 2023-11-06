package seminar3_4Kostik.bulder;

import seminar3_4Kostik.student.Student;

public class MyBuilder {
    private int id;

    public Student createStudent(String name,int age){
        return new Student(id,name,age);
    }
}
