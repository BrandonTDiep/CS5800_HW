package com.cpp.pizza;

import java.util.ArrayList;

public class PizzaBuilder {

    private String chainName;
    private String size;
    private ArrayList<String> toppings = new ArrayList<>();

    public PizzaBuilder addPepperoni() {
        toppings.add("Pepperoni");
        return this;
    }

    public PizzaBuilder addSausage() {
        toppings.add("Sausage");
        return this;
    }

    public PizzaBuilder addMushrooms() {
        toppings.add("Mushrooms");
        return this;
    }

    public PizzaBuilder addBacon() {
        toppings.add("Bacon");
        return this;
    }

    public PizzaBuilder addOnions() {
        toppings.add("Onions");
        return this;
    }

    public PizzaBuilder addExtraCheese() {
        toppings.add("Extra Cheese");
        return this;
    }

    public PizzaBuilder addPeppers() {
        toppings.add("Peppers");
        return this;
    }

    public PizzaBuilder addChicken() {
        toppings.add("Chicken");
        return this;
    }

    public PizzaBuilder addOlives() {
        toppings.add("Olives");
        return this;
    }

    public PizzaBuilder addSpinach() {
        toppings.add("Spinach");
        return this;
    }

    public PizzaBuilder addTomatoAndBasil() {
        toppings.add("Tomato and Basil");
        return this;
    }

    public PizzaBuilder addBeef() {
        toppings.add("Beef");
        return this;
    }

    public PizzaBuilder addHam() {
        toppings.add("Ham");
        return this;
    }

    public PizzaBuilder addPesto() {
        toppings.add("Pesto");
        return this;
    }

    public PizzaBuilder addSpicyPork() {
        toppings.add("Bacon ");
        return this;
    }

    public PizzaBuilder addHamAndPineapple() {
        toppings.add("Ham and Pineapple");
        return this;
    }

    public PizzaBuilder setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }

    public PizzaBuilder setSizeSmall() {
        this.size = "Small";
        return this;
    }

    public PizzaBuilder setSizeMedium() {
        this.size = "Medium";
        return this;
    }

    public PizzaBuilder setSizeLarge() {
        this.size = "Large";
        return this;
    }

    public Pizza build() {
        return new Pizza(chainName, size, toppings);
    }


}
