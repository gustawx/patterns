package com.company;

import com.company.observer.MessageStream;
import com.company.observer.clients.PhoneClient;
import com.company.observer.Subject;
import com.company.observer.clients.TabletClient;
import javafx.scene.control.Tab;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String... args){
//        Node node3 = new Node(3, null);
//        Node node2 = new Node(2, node3);
//        Node node1 = new Node(1, node2);
//
////        node1.reverse();
//        System.out.println(node1 + " " + node2 + " " + node3);
//        System.out.println(node1);

        /**
        // BUILDER
        BuilderPattern builderPattern = new BuilderPattern.Builder().dish("This is a dish").build();
        System.out.println(builderPattern.getDish());
        System.out.println("Bread should be null:");
        System.out.println(builderPattern.getBread());

        // FACTORY
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);x    
        System.out.println(site.getPages());
        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());

        // ABSTRACT FACTORY
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(card2.getClass());

        // DECORATOR
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());

        // OBSERVER
        Subject subject = new MessageStream();
        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);
        phoneClient.addMessage("I'm a phone");
        tabletClient.addMessage("I'm a tablet");
         */
    }
}
