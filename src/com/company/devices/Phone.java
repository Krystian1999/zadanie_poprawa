package com.company.devices;

import com.company.Human;
import com.company.Salleable;

import java.net.URL;
import java.util.List;

public class Phone extends Device {

    public String model;
    public static final String appName = "aplipkacja";
    public static final String version = "1.0";
    public static final String serverAddress = "3000";
    public List<String> appList;
    public URL url;


    public Phone() {

    }

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

                if (seller.getGarage() == null) {
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
    public String toString() {
        return "";
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String installAnnApp(String appName) {

        return appName;
    }

    public String installAnnApp(String appName, String version) {

        return appName + version;
    }

    public String installAnnApp(String appName, String version, String serverAddress) {

        return appName + version + serverAddress;
    }

    public String installAnnApp(List<String> appList) {

        return appList.toString();
    }

    public String installAnnApp(URL url) {

        return url.toString();
    }
}
