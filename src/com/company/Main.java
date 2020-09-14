package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;
import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;


public class Main {

    public static void main(String[] args) {

        Human me = new Human();

        me.name = "Krystian";
        me.lastname = "Gawin";

        Animal animal = new Pet();

        Animal pet = new Animal("dog", 20.0) {
            @Override
            public void feed(Double foodWeight) {

            }
        };
        pet.name = "Rex";

        animal.feed();

        Animal animal_1 = new FarmAnimal("cow",200.0);

        Car bmw = new Car();

        Car audi = new Car();

        audi.producer = "Audi";
        audi.model = "RS7";
        audi.price = 9000.0;

        bmw.producer = "BMW";
        bmw.model = "M3";
        bmw.price = 4000.0;

        me.setNewCar(bmw);

        System.out.println(me.toString());
        System.out.println(bmw.toString());
        System.out.println(pet.toString());
        bmw.turnOn();


        Phone phone = new Phone();
        phone.setModel("Samsung");


    }
}



