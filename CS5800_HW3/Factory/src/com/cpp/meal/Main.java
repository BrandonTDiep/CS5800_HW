package com.cpp.meal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Brandon", DietPlan.NO_RESTRICTION));
        customers.add(new Customer("Nima", DietPlan.PALEO));
        customers.add(new Customer("Yu", DietPlan.VEGAN));
        customers.add(new Customer("Ericcson", DietPlan.NUT_ALLERGY));
        customers.add(new Customer("Gilbert", DietPlan.NO_RESTRICTION));
        customers.add(new Customer("Tannaz", DietPlan.NUT_ALLERGY)); 

        MacronutrientFactory mealFactory = MealFactory.getInstance();

        CarbsFactory carbFactory = mealFactory.createCarb();
        ProteinFactory proteinFactory = mealFactory.createProtein();
        FatsFactory fatFactory = mealFactory.createFat();

        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
            System.out.println("Diet Plan: " + customer.getDietPlan());

            Carbs carb = carbFactory.createCarb(customer.getDietPlan());
            Protein protein = proteinFactory.createProtein(customer.getDietPlan());
            Fats fat = fatFactory.createFat(customer.getDietPlan());

            Meal meal = new Meal(carb, protein, fat);

            System.out.println(meal);
            System.out.println("--------------------");
        }
    }
}