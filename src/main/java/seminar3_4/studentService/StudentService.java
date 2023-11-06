package seminar3_4.studentService;

import seminar3_4.studentDomen.PersonComparator;
import seminar3_4.studentDomen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IUserService<Student>{
    private int count;
    private List<Student> students;

    public StudentService() {
        this.students=new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String name, String surname, int age) {
        Student per=new Student(name,surname,age,count);
        count++;
        students.add(per);
    }

    public List<Student> getSotredByFIOStudentsList(){
        List<Student> newAtudList=new ArrayList<>(students);
        newAtudList.sort(new PersonComparator<Student>());
        return newAtudList;
    }


}
