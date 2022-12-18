package com.tongji.michelin.product.state;

import com.tongji.michelin.product.Product;

/**
 * @classname StoriedState
 * @description TODO
 */
public class StoriedState extends ProductState {
// methods
    @Override
    public void gotoNextState(Product product) {
        System.out.println("The product has been storied.");
    }

    @Override
    public String toString() {
        return "storied state";
    }
}
