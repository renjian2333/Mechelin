package com.tongji.michelin.product.state;

import com.tongji.michelin.product.Product;

/**
 * @classname ProductState
 * @description TODO Design Pattern --- State
 */
public abstract class ProductState {
// methods
    public abstract void gotoNextState(Product product);
}
