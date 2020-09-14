package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

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

        System.out.println(me.toString());
        System.out.println(bmw.toString());
        System.out.println(pet.toString());
        bmw.turnOn();


        Phone phone = new Phone();
        phone.setModel("Samsung");

        Animal animal = new Animal("dog");

        Human seller = new Human();
        seller.setPhone(phone);
        seller.setPet(animal);
        seller.setCar(bmw);
        seller.setSalary(0.0);

        Human buyer = new Human();
        buyer.setSalary(0.0);
        buyer.setCash(8000);

        System.out.println("pieniądze sprzedającego przed transakcją: " + seller.getCash());
        System.out.println("pieniądze kupujacego przed transakcją: " + buyer.getCash());

        animal.salleable.sell(seller, buyer, 4000.0);
        bmw.salleable.sell(seller, buyer, 1000.0);
        phone.salleable.sell(seller, buyer, 6000.0);

        System.out.println("pieniądze sprzedającego po transakcji: " + seller.getCash());
        System.out.println("pieniądze kupującego po  transakcją: " + buyer.getCash());

    }
}



