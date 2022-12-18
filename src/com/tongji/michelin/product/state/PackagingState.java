package com.tongji.michelin.product.state;

import com.tongji.michelin.product.Product;

/**
 * @classname PackagingState
 * @description TODO
 */
public class PackagingState extends ProductState {
// methods
    @Override
    public void gotoNextState(Product product) {
        product.setState(new PackagedState());
        System.out.println("From packaging state to packaged state. Waiting for storing...");
    }

    @Override
    public String toString() {
        return "packaging state";
    }
}
