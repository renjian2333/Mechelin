package com.tongji.michelin.product.dessert.dessertmix;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

import com.tongji.michelin.product.dessert.Dessert;
import com.tongji.michelin.product.dinner.Dinner;
import com.tongji.michelin.rawmaterial.RawMaterial;
import com.tongji.michelin.rawmaterial.packagematerial.Box;
import com.tongji.michelin.product.Product;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname ChocolateMix
 * @description Mixed chocolate pack. This is a part of Flyweight Pattern.
 * @date 2020/11/23 23:40
 */
public class DessertMix extends Dessert {
// fields
    private final Dessert[] desserts;

    /**
     * ctor of ChocolateMix
     *
     * @param typeList List of extended class of Chocolate. Eg: MilkChocolate.class
     * @throws NewInstanceFailureException Thrown when failed to create an instance.
     */
    public DessertMix(List<Class<? extends Dessert>> typeList)
            throws NewInstanceFailureException {
        super("Dessert Mix", Integer.MAX_VALUE, 0);
        Dessert dessert = null;
        int chocolateShelfLife = 0;
        int index = 0;

        desserts = new Dessert[typeList.size()];
        for (Class<? extends Dessert> type : typeList) {
            dessert = MixDessertFactory.getDessert(type);
            desserts[index] = dessert;
            weight += dessert.getWeight();
            chocolateShelfLife = dessert.getShelfLife();
            if (chocolateShelfLife < shelfLife) {
                shelfLife = chocolateShelfLife;
            }
            index++;
        }
        this.initIngredientList();
    }

    /**
     * Get chocolate instance at index.
     *
     * @param index index of instance
     * @return chocolate instance
     */
    public Dessert at(int index) {
        if (index >= 0 && index < desserts.length) {
            return desserts[index];
        } else {
            return null;
        }
    }

    @Override
    public void packaging() {
        super.gotoNextState();
        System.out.println("Start packaging Chocolate Mix...");
        super.pack = new Box(0);
        super.gotoNextState();
        System.out.println("Finish packaging Chocolate Mix.");
        super.gotoNextState();

        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        super.setProducedDate(df.format(day));
    }

    @Override
    protected void initIngredientList() {
        for (Dessert dessert : desserts) {
            for (RawMaterial material : dessert.ingredientList) {
                if (!ingredientList.contains(material)) {
                    ingredientList.add(material);
                }
            }
        }
    }

}
