package com.company;

public class Animal {
    final static Double DEFAULT_WEIGHT_DOG = 16.0;
    final static Double DEFAULT_WEIGHT_CAT = 8.0;
    final String species;
    String name;
    private double weight;


    public Animal(String species) {
        this.species = species;

        if(this.species == "dog"){
            weight = DEFAULT_WEIGHT_DOG;
        }
        else if (this.species == "cat"){
            weight = DEFAULT_WEIGHT_CAT;
        }

    }

    void feed(){
        weight+= 4;
        if(weight>=100) {
            System.out.println("Zmarłem z przejedzenia");
        }else if (weight<=0){
            System.out.println("Nie żyje,nie nakarmisz mnie");
        }else
            System.out.println("Eleganckie jedzenie, waga wynosi " + weight);
    }
    void walk(){
        weight-=4;
        if(weight>=100) {
            System.out.println("Nie żyje,nie wyprowadzisz mnie");
        }else if (weight<=0){
            System.out.println("Zmarłem z przemeczenia");
        }else
            System.out.println("Elegnacki spacer, waga wynosi " + weight);
    }

}