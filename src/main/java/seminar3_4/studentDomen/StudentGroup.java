package seminar3_4.studentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

   /* @Override
    public Iterator<Student> iterator() {

        return  new StudentGroupIterator(students);
    }*/

    //анонимный итератор
    @Override
    public Iterator<Student> iterator() {

        return  new Iterator<Student>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < students.size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                return students.get(index++);
            }
        };
   }

}
