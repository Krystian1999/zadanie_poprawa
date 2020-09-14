package com.company.devices;

import com.company.Human;
import com.company.Salleable;

public class Car extends Device {

    public Double price ;

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
            if (buyer.getCash() >= price) {
                if (seller.getPet() == null) {
                    System.out.println("Nie mam zwierzęcia na sprzedaż");
                } else {
                    System.out.println("Mam zwierzę na sprzedaż");

                }

                if (seller.getCar() == null) {
                    System.out.println("Nie mam samochodu na sprzedaż");
                } else {
                    System.out.println("Mam samochód na sprzedaż");
                    buyer.setCash(-price);
                    buyer.setCar(seller.getCar());
                    seller.setCash(+price);
                }

                if (seller.getPhone() == null) {
                    System.out.println("Nie mam telefonu na sprzedaż");
                } else {
                    System.out.println("Mam telefon na sprzedaż");
                }
            } else {
                System.out.println("Nie masz hajsu");
            }


        }

    };
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
