package com.tongji.michelin.product.state;

import com.tongji.michelin.product.Product;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname ProductState
 * @description TODO Design Pattern --- State
 * @date 2020/11/21 21:59
 */
public abstract class ProductState {
// methods
    public abstract void gotoNextState(Product product);
}
