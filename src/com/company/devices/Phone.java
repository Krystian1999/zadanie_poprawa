package com.company.devices;

import com.company.Human;
import com.company.Salleable;
import com.company.devices.Application;

import java.net.URL;
import java.util.List;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;

public class Phone extends Device {

    public String model;
    public static final String appName = "aplipkacja";
    public static final String version = "1.0";
    public static final String serverAddress = "3000";
    public List<Application> appList;
    public Application application;
    public  Human human;
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

    public void installNewApp(){
        if(human.getCash()>application.price){
            appList.add(application);
            human.setCash(-application.price);
            System.out.println("zainstalowano apke");
        }
    }

    public  void isInstalled(Application app){
        if(app.equals(application)){
            System.out.println("Aplikacja jest zainstalowana");
        }else
            System.out.println("Aplikacja nie jest zainstalowana");
    }

    public  void isInstalled(String name){
        if(name.equals(application.getName())){
            System.out.println("Aplikacja jest zainstalowana");
        }else
            System.out.println("Aplikacja nie jest zainstalowana");
    }

    public List<Application> freeApplication(Application list){

        for (Application app:appList){
            if (app.price == 0) {
                List<Application> freeApp = new ArrayList<>();
                freeApp.add(list);
                return freeApp;
            }
        }

        return appList;
    }

    public void valueAllApp(){
        double value;
        for(int i = 0 ; i<appList.size();i++){
            value =+ appList.get(i).getPrice();
            System.out.print(value);
        }

    }

    public void sortByAlphabet(){
        java.util.Collections.sort(appList, Collator.getInstance());
    }


    public int compare(Application application, Application application_1)
    {
        return application.getPrice() - application_1.getPrice();
    }


    public List<Application> sortByPrice(){

        Collections.sort(appList, this::compare);
        Collections.reverse(appList);
        System.out.println("Posortowano po cenie");
        for (int i=0; i<appList.size(); i++)
            System.out.println(appList.get(i));

        return appList;
    }
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
