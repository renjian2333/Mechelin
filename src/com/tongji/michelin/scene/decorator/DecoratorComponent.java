package com.tongji.michelin.scene.decorator;

/**
 * @classname DecoratorComponent
 * @description this is an interface implements getDescription getBuildCost
 */

public interface DecoratorComponent {
    /**
     * String represents the description of residence
     */
    String getDescription();

    /**
     * Return the cost of residence
     */
    double getBuildCost();
}
