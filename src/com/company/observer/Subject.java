package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public abstract void setState(String state);
    public abstract String getState();

    public void attach(Observer o){
        observers.add(o);
    }

    public void detach(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for (Observer o: observers){
            o.update();
        }
    }
}
