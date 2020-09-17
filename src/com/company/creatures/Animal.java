package com.company.creatures;

import com.company.Human;
import com.company.Salleable;

public abstract class Animal implements Feedable {
    String species = "dog";
    public String name;
    private double weight;


    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }
    public Animal() {
        this.weight = 20.0;
    }

    public String toString() {
        return species + " " + name + " " + weight;
    }

   public void feed(){
        weight+= 4;
        if(weight>=100) {
            System.out.println("Zmarłem z przejedzenia");
        }else if (weight<=0){
            System.out.println("Nie żyje,nie nakarmisz mnie");
        }else
            System.out.println("Eleganckie jedzenie, waga wynosi " + weight);
    }
   public void walk(){
        weight-=4;
        if(weight>=100) {
            System.out.println("Nie żyje,nie wyprowadzisz mnie");
        }else if (weight<=0){
            System.out.println("Zmarłem z przemeczenia");
        }else
            System.out.println("Elegnacki spacer, waga wynosi " + weight);
    }

    public Salleable salleable = new Salleable() {
        @Override
        public void sell(Human seller, Human buyer, Double price) {
            if(buyer.getCash()>=price) {
                if (seller.getPet() == null) {
                    System.out.println("Nie mam zwierzęcia na sprzedaż");
                } else {
                    System.out.println("mam zwierzę na sprzedaż");
                    buyer.setCash(-price);
                    buyer.setPet(seller.getPet());
                    seller.setCash(+price);
                }

                if (seller.getGarage() == null) {
                    System.out.println("Nie mam samochodu na sprzedaż");
                } else {
                    System.out.println("Mam samochód na sprzedaż");
                }

                if (seller.getPhone() == null) {
                    System.out.println("Nie mam telefonu na sprzedaż");
                } else {
                    System.out.println("Mam telefon na sprzedaż");
                }
            }else {
                System.out.println("nie masz hajsu");
            }


        }

    };

}