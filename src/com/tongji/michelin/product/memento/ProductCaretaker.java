package com.tongji.michelin.product.memento;

/**
 * @classname ProductCaretaker
 * @description ProductCaretaker in ProductMemento pattern
 */
public class ProductCaretaker {
// fields
    private ProductMemento productMemento;

    public void setProductMemento(ProductMemento productMemento) {
        this.productMemento = productMemento;
    }

    public ProductMemento getProductMemento() {
        return productMemento;
    }


}
