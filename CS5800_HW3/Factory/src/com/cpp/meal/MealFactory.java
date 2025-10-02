package com.cpp.meal;

public class MealFactory extends MacronutrientFactory {
    private static MealFactory instance = new MealFactory();
    
    private MealFactory() {}

    public static MealFactory getInstance() {
        return instance;
    }

    @Override
    public CarbsFactory createCarb() {
        return CarbsFactory.getInstance();
    }

    @Override
    public ProteinFactory createProtein() {
        return ProteinFactory.getInstance();
    }

    @Override
    public FatsFactory createFat() {
        return FatsFactory.getInstance();
    }
}
