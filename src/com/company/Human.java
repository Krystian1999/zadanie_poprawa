package com.company;


import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human {
    public Phone phone;
    public String name;
    public String lastname;
    public Animal pet;
    Double cash = 0.0;
    private Car car;
    private Double salary = 1000.0;

    Date date = new Date();



    public String toString() {
        return name + " " + lastname + " " + salary;
    }


    public void setCar(Car car){
        this.car = car;
    }

    public Car getCar() {
        return car;
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
    public void setNewCar(Car car) {
        if (salary >= car.price) {
            System.out.println("Mozesz kupic nowe autko");
            getCar();
        } else if (salary > (car.price / 12)) {
            System.out.println("Mozesz kupic auto na kredyt");
            getCar();
        } else {
            System.out.println("Nie masz hajsu");
        }
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
