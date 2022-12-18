package com.tongji.michelin.machine.processmachine.wrappermachine.strategy;

import com.tongji.michelin.product.Product;

/**
 * @classname WrapStrategy
 * @description TODO Design Pattern --- StrategyTest
 * abstract class of the wrap strategy, each kind of wrap strategy must implement it.
 */
public abstract class WrapStrategy {

    public abstract void packaging(Product product);
}
