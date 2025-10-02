package com.cpp.pizza;

public class LittleCaesarsPizzaBuilder {

    public static PizzaBuilder createPizza() {
        return new PizzaBuilder().setChainName("Little Caesars");
    }
}
