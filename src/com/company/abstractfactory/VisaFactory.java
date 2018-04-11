package com.company.abstractfactory;

import com.company.abstractfactory.cards.CreditCard;
import com.company.abstractfactory.cards.VisaBlackCreditCard;
import com.company.abstractfactory.cards.VisaGoldCreditCard;
import com.company.abstractfactory.validators.Validator;
import com.company.abstractfactory.validators.VisaValidator;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:

                return new VisaGoldCreditCard();

            case PLATINUM:

                return new VisaBlackCreditCard();

        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }

}
