package com.cpp.pizza;

public class Main {
    public static void main(String[] args) {
        // Pizza Hut small pizza with 3 toppings
        Pizza pizzaHutPizza1 = PizzaHutPizzaBuilder.createPizza()
                .setSizeSmall()
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .build();

        // Pizza Hut medium pizza with 6 toppings
        Pizza pizzaHutPizza2 = PizzaHutPizzaBuilder.createPizza()
                .setSizeMedium()
                .addChicken()
                .addBacon()
                .addPesto()
                .addTomatoAndBasil()
                .addSpinach()
                .addMushrooms()
                .build();

        // Pizza Hut large pizza with 9 toppings
        Pizza pizzaHutPizza3 = PizzaHutPizzaBuilder.createPizza()
                .setSizeLarge()
                .addHamAndPineapple()
                .addPepperoni()
                .addSpicyPork()
                .addBeef()
                .addExtraCheese()
                .addOlives()
                .addChicken()
                .addBacon()
                .addMushrooms()
                .build();

        // Pizza Hut Pizzas
        // large pizza with 3 toppings
        Pizza pizzaHutPizza4 = PizzaHutPizzaBuilder.createPizza()
                .setSizeLarge()
                .addExtraCheese()
                .addOlives()
                .addOnions()
                .build();

        // small pizza with 2 toppings
        Pizza pizzaHutPizza5 = PizzaHutPizzaBuilder.createPizza()
                .setSizeSmall()
                .addBeef()
                .addBacon()
                .build();

        // Little Caesars Pizza
        // medium pizza with 8 toppings
        Pizza littleCaesarsPizza1 = LittleCaesarsPizzaBuilder.createPizza()
                .setSizeMedium()
                .addHam()
                .addOlives()
                .addOnions()
                .addPesto()
                .addExtraCheese()
                .addSpinach()
                .addSausage()
                .addPeppers()
                .build();

        // small pizza with 6 toppings
        Pizza littleCaesarsPizza2 = LittleCaesarsPizzaBuilder.createPizza()
                .setSizeSmall()
                .addMushrooms()
                .addSpinach()
                .addTomatoAndBasil()
                .addOlives()
                .addOnions()
                .addPeppers()
                .build();

        // Dominos Pizzas
        // small pizza with 1 topping
        Pizza dominosPizza1 = DominosPizzaBuilder.createPizza()
                .setSizeSmall()
                .addPepperoni()
                .build();

        // large pizza with 3 toppings
        Pizza dominosPizza2 = DominosPizzaBuilder.createPizza()
                .setSizeLarge()
                .addBeef()
                .addOnions()
                .addPepperoni()
                .build();

        pizzaHutPizza1.eat();
        pizzaHutPizza2.eat();
        pizzaHutPizza3.eat();
        pizzaHutPizza4.eat();
        pizzaHutPizza5.eat();

        littleCaesarsPizza1.eat();
        littleCaesarsPizza2.eat();

        dominosPizza1.eat();
        dominosPizza2.eat();
    }
}