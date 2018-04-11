package com.company.abstractfactory.validators;

import com.company.abstractfactory.cards.CreditCard;

public interface Validator {
    boolean isValid(CreditCard creditCard);
}
