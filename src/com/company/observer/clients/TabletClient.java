package com.company.observer.clients;

import com.company.observer.Observer;
import com.company.observer.Subject;

public class TabletClient extends Observer {
    public TabletClient(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message){
        subject.setState(message + " - sent from table");
    }

    @Override
    protected void update() {
        System.out.println("Tablet stream: "+ subject.getState());
    }
}
