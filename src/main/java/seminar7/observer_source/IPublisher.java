package seminar7.observer_source;

import seminar7Kostik.bahavioral.observer.Observer;

public interface IPublisher {
    void  registerObserver(IObserver observer);
    void removeObserver(IObserver iObserver);
    void sendOffer(String nameCompany,int salary);
}
