package com.cpp.pizza;
import java.util.ArrayList;

public class Pizza {
    private String chainName;
    private String size;
    private ArrayList<String> toppings;

    public Pizza(String chainName, String size, ArrayList<String> toppings) {
        this.chainName = chainName;
        this.size = size;
        this.toppings = toppings;
    }

    public String getChainName() {
        return chainName;
    }

    public void setChainName(String chainName) {
        this.chainName = chainName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public void eat() {
        System.out.println(chainName);
        System.out.println("Size: " + size);
        for (String pizzaTopping: toppings) {
            System.out.println("* " + pizzaTopping);
        }
        System.out.println();
    }
}
