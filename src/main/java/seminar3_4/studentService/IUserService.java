package seminar3_4.studentService;

import java.util.List;

public interface IUserService <T> {
    List<T> getAll();
    void create(String name,String surname, int age);
}
