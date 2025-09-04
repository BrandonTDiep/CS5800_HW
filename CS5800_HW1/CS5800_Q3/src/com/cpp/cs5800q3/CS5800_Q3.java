package com.cpp.cs5800q3;

public class CS5800_Q3 {

    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Ship Brandon", "2025");
        ships[1] = new CruiseShip("Disney Cruise", "2012", 3005);
        ships[2] = new CargoShip("Carry Cargo Ship", "1900", 150000);

        for (Ship s: ships) {
            s.print();
        }

    }

}
