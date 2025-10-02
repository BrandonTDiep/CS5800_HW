package com.cpp.meal;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class CarbsFactory {
    private final Random random = new Random();
    private static final CarbsFactory instance = new CarbsFactory();
    private final List<Carbs> carbsList = new ArrayList<>();
    private CarbsFactory () {}

    public static CarbsFactory getInstance() {
        return instance;
    }


    public Carbs createCarb(DietPlan dietPlan) {

        if(dietPlan == DietPlan.PALEO) {
            carbsList.add(new Pistachio());
        }
        else if (dietPlan == DietPlan.VEGAN) {
            carbsList.addAll(List.of(new Bread(), new Lentils(), new Pistachio()));
        }
        else if(dietPlan == DietPlan.NUT_ALLERGY) {
            carbsList.addAll(List.of(new Cheese(), new Bread(), new Lentils()));
        }
        else {
            carbsList.addAll(List.of(new Cheese(), new Bread(), new Lentils(), new Pistachio()));
        }
        return carbsList.get(random.nextInt(carbsList.size()));

    }

}
