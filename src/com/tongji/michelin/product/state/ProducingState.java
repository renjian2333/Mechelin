package com.tongji.michelin.product.state;

import com.tongji.michelin.product.Product;

/**
 * @classname ProducingState
 * @description TODO
 */
public class ProducingState extends ProductState {
// methods
    @Override
    public void gotoNextState(Product product) {
        product.setState(new ProducedState());
        System.out.println("From producing state to produced state, waiting for packaging.");
    }

    @Override
    public String toString() {
        return "producing state";
    }
}
