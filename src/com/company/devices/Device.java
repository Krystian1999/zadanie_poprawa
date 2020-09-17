package com.company.devices;

public abstract class  Device {
    public String producer;
    public String model;
    public int yearOfProduction;
    public Double price ;



    public String toString(){

        return producer+" "+model+" "+yearOfProduction;
    }
    public abstract boolean turnOn();
}
