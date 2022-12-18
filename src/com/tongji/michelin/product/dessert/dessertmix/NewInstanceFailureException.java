package com.tongji.michelin.product.dessert.dessertmix;

/**
 * @classname NewInstanceFailureException
 * @description Exception thrown when MixChocolateFactory.getChocolate() failed to create an
 * instance of extended Chocolate. In normal cases, this exception SHOULD NEVER BE
 * THROWN, as the param of MixChocolateFactory.getChocolate() is required to be one of
 * the extended classes of Chocolate and they all have trival ctor with no param.
 */
public class NewInstanceFailureException extends Exception {
// fields
    static final long serialVersionUID = 1L;
// constructor
    public NewInstanceFailureException(Class<?> type) {
        super("Failed to create dessert of type: " + type.getSimpleName());
    }

}
