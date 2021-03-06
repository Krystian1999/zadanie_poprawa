package com.company.devices;

import com.company.Human;
import com.company.Salleable;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device {

    public List<Human> carOwner;

    public List<Human> getCarOwner() {
        return carOwner;
    }
    public void setCarOwner(List<Human> carOwner) {
        this.carOwner = carOwner;
    }
    public int countTransactions(){
        return  carOwner.size();
    }

    public void checkCarOwnerInPast(Human human) {
        if (carOwner.equals(human) == true) {
            System.out.println("Samochód miał właściciela");
        } else
            System.out.println("Samochód nie miał własciciela");
    }

    public void checkCarSellerforBuyer(Human seller,Human buyer) {

        for (Human human: carOwner){
            if(carOwner.equals(seller)&& carOwner.equals(buyer)){
                System.out.println("");
            }
        }
    }

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
