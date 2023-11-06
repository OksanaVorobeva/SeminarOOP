package seminar3_4Kostik.group;

import seminar3_4Kostik.group.iterators.Studentiterator;
import seminar3_4Kostik.student.Student;
import seminar3_4Kostik.student.comparators.StudentComparatorByAge;
import seminar3_4Kostik.student.comparators.StudentComparatorByName;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student>{
    private List<Student> studentList;

    public StudyGroup() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new Studentiterator(studentList);
    }

    public void sortByName(){
        studentList.sort(new StudentComparatorByName());
    }

    public void sortByAge(){
        studentList.sort(new StudentComparatorByAge());
    }
}
