package com.company.abstractfactory.validators;

import com.company.abstractfactory.cards.CreditCard;

public class AmexPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
