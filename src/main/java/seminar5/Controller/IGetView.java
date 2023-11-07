package seminar5.Controller;

import seminar5.model.Student;

import java.util.List;

public interface IGetView  {
    void printAllStudents(List<Student> students);
    String prompt(String massage);
}
