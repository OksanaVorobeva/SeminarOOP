package seminar3_4.studentControllers;

import seminar3_4.studentDomen.User;

public interface IUserControllers<T extends User> {
    void create(String name,String surname, int age);
}
