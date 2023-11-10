package seminar7.observer_source;

import seminar7Kostik.bahavioral.observer.Button;
import seminar7Kostik.bahavioral.observer.Observer;

public class Master implements IObserver {
    String name;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (salary<80){
            System.out.println("g");
        }else {
            System.out.println("n");
        }
    }
}
