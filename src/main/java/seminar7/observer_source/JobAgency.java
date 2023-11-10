package seminar7.observer_source;

import seminar7Kostik.bahavioral.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements IPublisher{
    List<IObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver iObserver) {
observers.remove(iObserver);
    }

    @Override
    public void sendOffer(String nameCompany, int salary) {
        for(IObserver observer:observers){
            observer.receiveOffer(nameCompany,salary);
        }
    }
}
