package com.company;


import java.util.Date;

public class Human {
    public Animal pet;
    public Car car;
    private Double salary = 1000.0;

    Date date = new Date();


    public void setCar(Car car){
        this.car = car;
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
}
