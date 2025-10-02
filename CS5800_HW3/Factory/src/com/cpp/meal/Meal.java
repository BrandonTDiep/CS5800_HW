package com.cpp.meal;

public class Meal {
    private final Carbs carb;
    private final Protein protein;
    private final Fats fat;

    public Meal(Carbs carb, Protein protein, Fats fat) {
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Meal Plan:\n" +
                "   Carb:    " + carb.getName() + "\n" +
                "   Protein: " + protein.getName() + "\n" +
                "   Fat:     " + fat.getName();
    }
}
