package com.cpp.pizza;

public class PizzaHutPizzaBuilder {

    public static PizzaBuilder createPizza() {
        return new PizzaBuilder().setChainName("Pizza Hut");
    }
}
