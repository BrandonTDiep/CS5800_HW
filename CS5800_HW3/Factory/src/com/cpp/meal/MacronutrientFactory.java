package com.cpp.meal;

public abstract class MacronutrientFactory {
    public abstract CarbsFactory createCarb();
    public abstract ProteinFactory createProtein();
    public abstract FatsFactory createFat();
}
