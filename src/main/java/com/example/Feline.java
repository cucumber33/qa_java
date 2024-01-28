package com.example;

import java.util.List;
//
public class Feline extends Animal implements Predator, AnimalProperty {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    @Override
    public int getKittens() {
        return getKittens(1);
    }


    public List<String> getFoods(String animalType) throws Exception {
        return getFood(animalType);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }
}
