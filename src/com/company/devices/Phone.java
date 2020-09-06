package com.company.devices;

public class Phone extends Device {

    @Override
    public boolean turnOn() {
        System.out.println("Telefon uruchomiony");
        return true;
    }
}
