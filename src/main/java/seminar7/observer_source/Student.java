package seminar7.observer_source;

public class Student implements IObserver{
    String name;
    int salary;

    public Student(String name) {
        this.name = name;
        salary=0;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (salary<salary){
            System.out.println("g");
            this.salary=salary;
        }else {
            System.out.println("n");
        }
    }
}
