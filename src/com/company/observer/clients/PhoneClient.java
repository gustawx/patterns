package com.company.observer.clients;

import com.company.observer.Observer;
import com.company.observer.Subject;

public class PhoneClient extends Observer {
    public PhoneClient(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message){
        subject.setState(message + " sent from phone");
    }

    @Override
    protected void update() {
        System.out.println("Phone stream: " + subject.getState());
    }
}
