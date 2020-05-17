package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) {


        Animal animal = new Pet();
        animal.feed();
        animal.takeForAWalk();
        animal.feed();
        animal.feed();
        animal.feed();
        animal.feed();

        Animal animal_1 = new FarmAnimal("dog",9.0);

        Car pasat = new Disel();
        pasat.setColour("rudy");
        pasat.setModel("B5");
        pasat.setPrice(22745);
        pasat.setProducer("Pasat starego company");

        Car golf = new Disel();
        golf.setColour("butelkowa zielen ");
        golf.setModel("mk3");
        golf.setPrice(100);
        golf.setProducer("golfica kurwica coropration");


        Car seat = new Electric();
        seat.setColour("blue");
        seat.setModel("ibiza");
        seat.setPrice(999);
        seat.setProducer("SEAT ");

        Car audi = new LPG();
        seat.setColour("yellow");
        seat.setModel("A6");
        seat.setPrice(2999);
        seat.setProducer("Srałdi ");


        Human human = new Human();
        human.addMyCar(pasat);
        human.getSalary();
        System.out.println("...............................................");


        System.out.println(human.toString());
        System.out.println(pasat.toString());
        System.out.println(animal.toString());


        System.out.println("...............................................");


        Device device = new Phone();

        device.turnOn();

        Phone phone = new Phone();
        phone.setModel("ajfon ");

        Human seller = new Human();
        seller.setPhone(phone);
        seller.setPet(animal);
        seller.setSalary(200.0);

        Human buyer = new Human();
        buyer.setSalary(5500.0);
        buyer.setCash();

        System.out.println("^^^^^^^^^^^^^^^");


        animal.salleable.sell(seller, buyer, 75.0);
        System.out.println("xxxxxxxxxx");
        animal_1.salleable.sell(seller, buyer, 50.0);
        System.out.println(",,,,,,,,,,,,4");
        golf.salleable.sell(seller, buyer, 80.0);
        System.out.println(".........5");
        System.out.println("nabywca :" + buyer.getCash());
        System.out.println("sprzedawca:" + seller.getCash());

        System.out.println(buyer.pet.toString());

        System.out.println(Phone.adres);


    }
}
