package com.tongji.michelin.product.state;

import com.tongji.michelin.product.Product;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname PackagedState
 * @description TODO
 * @date 2020/11/21 22:01
 */
public class PackagedState extends ProductState {
// methods
    @Override
    public void gotoNextState(Product product) {
        if (product.getState() instanceof PackagedState) {
            product.setState(new StoriedState());
            System.out.println("From packaged state to storied state. The product is stored.");
        } else {
            System.out.println("The product hasn't been packaged! It can't be storied!");
        }
    }

    @Override
    public String toString() {
        return "packaged state";
    }
}
