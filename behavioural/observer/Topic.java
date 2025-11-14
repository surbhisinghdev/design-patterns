package observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Observable{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    List<Observer> observers;
    Topic() {
        observers = new ArrayList<>();
    }
    @Override
    public void addObservers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer observer: observers) observer.update(message);
    }
}
