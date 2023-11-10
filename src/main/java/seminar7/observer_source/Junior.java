package seminar7.observer_source;

import java.util.Random;

public class Junior implements IObserver{
    private String name;

    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (new Random().nextBoolean()){
            System.out.println("g");
        }else {
            System.out.println("n");
        }
    }
}
