package com.company;


import com.company.devices.Application;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.creatures.Animal;

import java.util.Date;
import java.util.*;



public class Human {
    public Phone phone;
    public String name;
    public String lastname;
    public Animal pet;
    Double cash = 0.0;
    private ArrayList<Car> garage;
    private Double salary = 1000.0;



    Date date = new Date();

    public String toString() {
        return name + " " + lastname + " " + salary;
    }

    public Human() {
        this.garage = new ArrayList(4);
    }
    public Human(int initialCapacity) {
        this.garage = new ArrayList(initialCapacity);
    }

    public ArrayList<Car> getGarage() {
        return garage;
    }
    public void setGarage(ArrayList<Car> garage) {
        this.garage = garage;
    }

    public void garageValue() {

        double value;
        for (int i = 0; i < garage.size(); i++) {

            value =+ garage.get(i).getPrice();

            System.out.print(value);
        }
    }

    public int compare(Car car_a, Car car_b)
    {
        return car_a.getYear() - car_b.getYear();
    }

    public List<Car> sortCarByYear(){

        Collections.sort(garage, this::compare);
        Collections.reverse(garage);
        System.out.println("Posortowane");
        for (int i=0; i<garage.size(); i++)
            System.out.println(garage.get(i));

        return garage;
    }

    public List<Car> setCar(Car car, int index) {

        garage.add(index, car);

        return garage;
    }

    public Car getAutoFromGarage(int index) {
        return garage.get(index);
    }

    public Double getSalary() {
        System.out.println(date + " " + salary);
        return salary;
    }

    public Double setSalary(Double salary) {

        if (salary < 0) {
            System.out.println("wartosc musi byc dodatnia");
        } else {
            System.out.println("Nowe dane zostały wysłane do systemu ksiegowania ");
            System.out.println("Musisz odebrac aneks do umowy od Hani");
            System.out.println("Zus i US wiedzą o zmianie wypłaty");
            System.out.println("Twoje nowe wynagrodzenie wynosi:" + salary*1.1);
            return this.salary = salary*1.1;

        }
        return this.salary = salary;
    }

    public void setCash(double cash) {
        this.cash = this.cash + cash;
    }

    public double getCash() {
        return cash + salary;
    }
    public Animal getPet() {
        return pet;
    }
    public void setPet(Animal pet) {
        this.pet = pet;
    }
    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

}
