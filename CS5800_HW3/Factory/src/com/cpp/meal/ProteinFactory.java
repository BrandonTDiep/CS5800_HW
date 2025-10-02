package com.cpp.meal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProteinFactory {
    private final Random random = new Random();
    private static final ProteinFactory instance = new ProteinFactory();
    private final List<Protein> proteinList = new ArrayList<>();
    private ProteinFactory () {}

    public static ProteinFactory getInstance() {
        return instance;
    }

    public Protein createProtein(DietPlan dietPlan) {

        if(dietPlan == DietPlan.PALEO) {
            proteinList.addAll(List.of(new Fish(), new Chicken(), new Beef()));
        }
        else if (dietPlan == DietPlan.VEGAN) {
            proteinList.add(new Tofu());
        }
        else {
            proteinList.addAll(List.of(new Fish(), new Chicken(), new Beef(), new Tofu()));
        }
        return proteinList.get(random.nextInt(proteinList.size()));

    }
}
