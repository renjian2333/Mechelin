package com.tongji.michelin.person.visitor.limit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @classname TerminalExpression
 * @description Terminal expression, implements the interface Expression.
 */
public class TerminalExpression implements Expression {

    private Set<String> set = new HashSet<String>();

    public TerminalExpression(String[] data) {
        set.addAll(Arrays.asList(data));
    }

    public boolean interpret(String info) {
        return set.contains(info);
    }

    @Override
    public String toString() {
        return "class TerminalExpression implements Expression";
    }
}
