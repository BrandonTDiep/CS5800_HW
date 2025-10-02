package com.cpp.meal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FatsFactory {
    private final Random random = new Random();
    private static final FatsFactory instance = new FatsFactory();
    private final List<Fats> fatsList = new ArrayList<>();
    private FatsFactory () {}

    public static FatsFactory getInstance() {
        return instance;
    }

    public Fats createFat(DietPlan dietPlan) {

        if(dietPlan == DietPlan.PALEO) {
            fatsList.addAll(List.of(new Avocado(), new Tuna(), new Peanuts()));
        }
        else if (dietPlan == DietPlan.VEGAN) {
            fatsList.addAll(List.of(new Avocado(), new Peanuts()));
        }
        else if(dietPlan == DietPlan.NUT_ALLERGY) {
            fatsList.addAll(List.of(new Avocado(), new SourCream(), new Tuna()));
        }
        else {
            fatsList.addAll(List.of(new Avocado(), new SourCream(), new Tuna(), new Peanuts()));
        }
        return fatsList.get(random.nextInt(fatsList.size()));

    }
}
