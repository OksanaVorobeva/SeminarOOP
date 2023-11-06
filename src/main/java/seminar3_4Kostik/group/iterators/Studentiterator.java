package seminar3_4Kostik.group.iterators;

import seminar3_4Kostik.student.Student;

import java.util.Iterator;
import java.util.List;

public class Studentiterator implements Iterator<Student> {
    private  int index;
    private List<Student> studentList;

    public Studentiterator(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return studentList.size()>index;
    }

    @Override
    public Student next() {
        return studentList.get(index++);
    }
}
