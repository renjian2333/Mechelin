package com.tongji.michelin.scene.staffarea.manufacturingarea.assemblyline;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname ChocolatesFactoryProducer
 * @description This class is used to obtain our specific chocolate factory
 * @date 2020/11/15 16:40
 */
public class RestaurantProducer {

    /**
     * This method is used to obtain our specific chocolate factory
     *
     * @return chocolate factory
     */
    public static DishAssemblyLine newRestaurant(String restaurantName) {

        if (AssemblyNameConst.CHINESE_RESTAURANT.equals(restaurantName)) {
            return new ChineseDishAssemblyLine();
        } else if (AssemblyNameConst.WESTERN_RESTAURANT.equals(restaurantName)) {
            return new WesternDishAssemblyLine();
        } else {
            throw new RuntimeException("restaurant name is error");
        }
    }

}