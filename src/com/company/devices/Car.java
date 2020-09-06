package com.company.devices;

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
}
