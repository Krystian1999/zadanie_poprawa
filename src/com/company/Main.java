package com.company;

import com.company.devices.Car;
import com.company.devices.Disel;
import com.company.devices.LPG;
import com.company.devices.Phone;
import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;


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

        Car bmw = new Disel();

        Car audi = new LPG();

        audi.producer = "Audi";
        audi.model = "RS7";
        audi.price = 9000.0;
        audi.yearOfProduction= 2018;

        bmw.producer = "BMW";
        bmw.model = "M3";
        bmw.price = 4000.0;
        bmw.yearOfProduction = 2017;

        me.setCar(bmw,0);
        me.setCar(audi,1);

        me.garageValue();
        me.sortCarByYear();

        System.out.println(me.toString());
        System.out.println(pet.toString());
        bmw.turnOn();


        Phone phone = new Phone();
        phone.setModel("Samsung");

        System.out.println(Phone.serverAddress);

        Human seller = new Human(3);
        seller.setCar(audi,0);
        seller.setCash(100);

        Human buyer = new Human(3);
        buyer.setCash(10000.0);
        buyer.setCar(null,0);

        audi.salleable.sell(seller, buyer, 4000.0);
        buyer.setCar(audi,0);
        System.out.println(buyer.getAutoFromGarage(0));




    }
}



