package com.tongji.michelin.product.state;

import com.tongji.michelin.product.Product;

/**
 * @classname ProducedState
 * @description TODO
 */
public class ProducedState extends ProductState {
// methods
    @Override
    public void gotoNextState(Product product) {
        product.setState(new PackagingState());
        System.out.println("From produced state to packaging state. Start packaging...");
    }

    @Override
    public String toString() {
        return "produced state";
    }
}
