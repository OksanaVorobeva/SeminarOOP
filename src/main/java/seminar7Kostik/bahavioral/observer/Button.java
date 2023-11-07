package seminar7Kostik.bahavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Button implements Observable{
    private int id;
    private List<Observer> observers;

    public Button(int id) {
        this.id = id;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }

    public  void onClick(){
        notifyObservers();
    }

    public int getId() {
        return id;
    }
}
