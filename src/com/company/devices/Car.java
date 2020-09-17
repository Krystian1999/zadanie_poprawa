package com.company.devices;

import com.company.Human;
import com.company.Salleable;

public abstract class Car extends Device {



    public abstract String refuel();

     public String toString() {
          return producer + " " + model + " " + price;
     }
     @Override
     public boolean turnOn() {
          System.out.println("Samochód uruchomiony");
          return true;
     }

    public Salleable salleable = new Salleable() {
        @Override
        public void sell(Human seller, Human buyer, Double price) {


            if (seller.getAutoFromGarage(0) != null) {
                System.out.println("Mam samochód na sprzedaż");


                if (buyer.getAutoFromGarage(0) == null) {

                    if (buyer.getCash() > price) {
                        seller.setCash(+price);
                        buyer.setCash(-price);
                        System.out.println("Kupiłes samochód");

                    } else {
                        System.out.println("Nie masz pieniedzy");
                    }
                } else {
                    System.out.println("Nie masz miejsca");
                }


            } else {
                System.out.println("Nie mam samochodu na sprzedaż");
            }
        }


    };
    public int getYear() {
        return yearOfProduction;
    }

    public void setYear(int year) {
        this.yearOfProduction = yearOfProduction;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }


}
