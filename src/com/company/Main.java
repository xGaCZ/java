package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.feed();
        animal.takeForAWalk();
        animal.feed();
        animal.feed();
        animal.feed();
        animal.feed();
        animal.feed();
        animal.feed();

        Human human = new Human();

        Car pasat = new Car();
        pasat.setColour("rudy");
        pasat.setModel("B5");
        pasat.setPrice(22745);
        pasat.setProducer("Pasat starego company");

        Car golf = new Car();
        golf.setColour("butelkowa zielen ");
        golf.setModel("mk3");
        golf.setPrice(100);
        golf.setProducer("golfica kurwica coropration");



        Car seat = new Car();
        seat.setColour("blue");
        seat.setModel("ibiza");
        seat.setPrice(999);
        seat.setProducer("SEAT ");


        human.addMyCar(pasat);

        System.out.println("............................");
        human.getSalary();

        System.out.println("...........................");
 
        System.out.println(pasat.toString());

        System.out.println("...........................");

        human.setMyCar(seat);
        human.setMyCar(golf);
        human.setMyCar(pasat);

    }
}
