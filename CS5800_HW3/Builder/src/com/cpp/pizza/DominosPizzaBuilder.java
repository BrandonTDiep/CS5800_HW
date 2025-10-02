package com.cpp.pizza;

public class DominosPizzaBuilder {

    public static PizzaBuilder createPizza() {
        return new PizzaBuilder().setChainName("Dominos");
    }
}
