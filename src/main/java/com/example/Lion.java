package com.example;

import java.util.List;

public class Lion {
    //Lion зависимый класс от класса-зависимости Feline, т.к. Lion использует методы класса Feline
    boolean hasMane;
    private AnimalProperty animalProperty;

    public Lion(String sex, AnimalProperty animalProperty) throws Exception {
        this.animalProperty = animalProperty;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return animalProperty.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return animalProperty.getFoods("Хищник");
    }
}