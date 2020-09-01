package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");
        dog.name = "Rex";

        dog.feed();
        dog.walk();
        dog.walk();
    }
}
