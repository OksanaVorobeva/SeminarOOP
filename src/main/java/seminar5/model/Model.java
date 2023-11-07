package seminar5.model;

import seminar5.Controller.IGetModel;

import java.util.List;

public class Model implements IGetModel {
    private List<Student> studentList;

    public Model(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getAllStudents(){
        return studentList;
    }
}
