package com.company.devices;

import com.company.Human;
import com.company.Salleable;

public class Phone extends Device {

    public String model;

    @Override
    public boolean turnOn() {
        System.out.println("Telefon uruchomiony");
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
                }

                if (seller.getPhone() == null) {
                    System.out.println("Nie mam telefonu na sprzedaż");
                } else {
                    buyer.setCash(-price);
                    buyer.setPhone(seller.getPhone());
                    seller.setCash(+price);
                }
            } else {
                System.out.println("Nie masz hajsu");
            }
        }
    };
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
