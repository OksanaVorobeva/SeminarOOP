package seminar3_4Kostik.service;

import seminar3_4Kostik.bulder.MyBuilder;
import seminar3_4Kostik.group.StudyGroup;
import seminar3_4Kostik.student.Student;

public class Service {
    private MyBuilder builder;
    private StudyGroup studyGroup;

    public Service() {
        builder=new MyBuilder();
        studyGroup=new StudyGroup();
    }

    public void addStudent(String name,int age){
        Student student =builder.createStudent(name,age);
        studyGroup.addStudent(student);
    }

    public  String getStudentListInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список студентов:\n");
        for (Student student: studyGroup) {
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
           return stringBuilder.toString();
        }
    public void sortByName(){
        studyGroup.sortByName();
    }

    public void sortByAge(){
        studyGroup.sortByAge();
    }

}

