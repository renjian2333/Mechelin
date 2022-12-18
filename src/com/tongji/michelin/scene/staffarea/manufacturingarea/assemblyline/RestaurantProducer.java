package com.tongji.michelin.scene.staffarea.manufacturingarea.assemblyline;

public class RestaurantProducer {

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