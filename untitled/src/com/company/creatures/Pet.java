package com.company.creatures;

import com.company.creatures.Animal;

public class Pet extends Animal {

    String species = "dog";
    private Double weight;


    public  Pet() {
    }

    public Pet(String species, Double weight) {
       super(species,weight);
    }

    @Override
    public void feed(Double foodWeight) {

    }
}
