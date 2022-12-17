package com.tongji.michelin.product.dessert.dessertmix;

import java.util.HashMap;

import com.tongji.michelin.product.dessert.Dessert;
import com.tongji.michelin.product.dinner.*;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname MixChocolateFactory
 * @description Factory class of ChocolateMix. This is a part of Flyweight Pattern.
 * @date 2020/11/16 00:32
 */
public class MixDessertFactory {
// fields
    private static final HashMap<Class<? extends Dessert>, Dessert> dessertMap =
            new HashMap<>();

    /**
     * Get an instance of certain subclass of Chocoate or create a new one if absent.
     *
     * @param type Extended class of Chocolate. eg: DarkChocolate.class
     * @return Instance of (extended) Chocolate.
     * @throws NewInstanceFailureException Thrown when failed to create an instance.
     */
    public static Dessert getDessert(Class<? extends Dessert> type)
            throws NewInstanceFailureException {
        Dessert dessert =
                dessertMap.computeIfAbsent(type, (Class<? extends Dessert> key) -> {
                    try {
                        System.out.println("Creating dessert of type: " + key.getSimpleName());
                        return key.getDeclaredConstructor().newInstance();
                    } catch (Exception e) {
                        return null;
                    }
                });

        if (dessert == null) {
            throw new NewInstanceFailureException(type);
        }
        return dessert;
    }

    /**
     * Hide the public ctor.
     */
    private MixDessertFactory() {
    }

}
