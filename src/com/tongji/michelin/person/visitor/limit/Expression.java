package com.tongji.michelin.person.visitor.limit;

/**
 * @classname Expression
 * @description Expression interface
 */
public interface Expression {
    public boolean interpret(String info);
}