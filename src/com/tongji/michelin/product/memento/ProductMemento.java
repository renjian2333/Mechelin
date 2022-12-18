package com.tongji.michelin.product.memento;

/**
 * @classname ProductMemento
 * @description ProductMemento in ProductMemento pattern
 */
public class ProductMemento {
// fields
    /**
     * the weight of this product's single item
     * correspond to param "weight" of Product
     */
    private int weight;

    public ProductMemento(int weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
