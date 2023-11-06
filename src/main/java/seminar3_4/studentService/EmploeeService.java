package seminar3_4.studentService;

import seminar3_4.studentDomen.Emploeer;
import seminar3_4.studentDomen.PersonComparator;
import seminar3_4.studentDomen.Student;

import java.util.ArrayList;
import java.util.List;

public class EmploeeService implements  IUserService<Emploeer>{
    private  int count;
    private List<Emploeer> emploeers;

    public EmploeeService() {
        this.emploeers=new ArrayList<>();
    }

    @Override
    public List<Emploeer> getAll() {
        return emploeers;
    }



    @Override
    public void create(String name, String surname, int age) {
        Emploeer per=new Emploeer(name,surname,age);
        count++;
        emploeers.add(per);
    }

    public List<Emploeer> getSotredByFIOStudentsList(){
        List<Emploeer> newEmploeerist=new ArrayList<>(emploeers);
        newEmploeerist.sort(new PersonComparator<Emploeer>());
        return newEmploeerist;
    }
}
