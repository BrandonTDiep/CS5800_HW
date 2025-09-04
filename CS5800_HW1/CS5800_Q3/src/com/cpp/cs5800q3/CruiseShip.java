package com.cpp.cs5800q3;

public class CruiseShip extends Ship {

    private int maxNumOfPassengers;

    public CruiseShip(String name, String year, int maxNumOfPassengers) {
        super(name, year);
        this.maxNumOfPassengers = maxNumOfPassengers;
    }

    public int getMaxNumOfPassengers() {
        return maxNumOfPassengers;
    }

    public void setMaxNumOfPassengers(int maxNumOfPassengers) {
        this.maxNumOfPassengers = maxNumOfPassengers;
    }

    @Override
    public void print() {
        System.out.println("Cruise Ship name: " + getName() + " | " + "Max Num. of Passengers: " + maxNumOfPassengers);
    }

}

