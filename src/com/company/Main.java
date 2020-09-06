package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();

        me.name = "Krystian";
        me.lastname = "Gawin";

        Animal pet = new Animal("dog");
        pet.name = "Rex";

        pet.feed();
        pet.walk();

        Car bmw = new Car();

        Car audi = new Car();

        audi.producer = "Audi";
        audi.model = "RS7";
        audi.price = 9000.0;

        bmw.producer = "BMW";
        bmw.model = "M3";
        bmw.price = 4000.0;

        me.setNewCar(bmw);

        me.getSalary();

        System.out.println(me.toString());
        System.out.println(bmw.toString());
        System.out.println(pet.toString());
        bmw.turnOn();
    }
}



