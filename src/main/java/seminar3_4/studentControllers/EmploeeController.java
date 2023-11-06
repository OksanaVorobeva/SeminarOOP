package seminar3_4.studentControllers;

import seminar3_4.studentDomen.Emploeer;
import seminar3_4.studentDomen.User;
import seminar3_4.studentService.EmploeeService;

public class EmploeeController implements IUserControllers<Emploeer>{

    private EmploeeService emoServ= new EmploeeService();

    @Override
    public void create(String name, String surname, int age) {
        emoServ.create(name,surname,age);
    }

    static  public <T  extends Emploeer> void paySalary(T user){
        System.out.println(((User)user).getName()+"Выплачена ЗП");
    }
}
