package seminar3_4.studentControllers;

import seminar3_4.studentDomen.Student;
import seminar3_4.studentService.StudentService;

public class StudentControllers implements IUserControllers<Student>{
    private StudentService dataService=new StudentService();

    @Override
    public void create(String name, String surname, int age) {
        dataService.create(name,surname,age);
    }
}
