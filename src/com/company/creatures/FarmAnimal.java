package com.company.creatures;

public class FarmAnimal extends Animal implements Edbile {

    String species = "dog";
    private Double weight;



    public FarmAnimal(String species, Double weight) {
        super();
    }



    @Override
    public void beEaten() {

    }

    @Override
    public void feed(Double foodWeight) {

    }
}
