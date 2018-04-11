package com.company.abstractfactory;

import com.company.abstractfactory.cards.CreditCard;
import com.company.abstractfactory.validators.Validator;

//Abstract factory
public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore){

        if (creditScore > 650) return new AmexFactory();
        else return new VisaFactory();
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
