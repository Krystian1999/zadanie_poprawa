package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        Animal pet = new Animal("dog");
        pet.name = "Rex";

        pet.feed();
        pet.walk();

        Car bmw = new Car();

        bmw.producer = "BMW";
        bmw.model = "M3";
        bmw.price = 4000.0;

        me.setCar(bmw);

        me.getSalary();
    }
}



