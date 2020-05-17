package com.company.devices;

import com.company.creatures.Human;
import com.company.Salleable;

public abstract class Car extends Device  {


    public String model;
    public String producer;
    public String colour;
    public int price = 300;

    public abstract String refuel();

    public Salleable salleable = new Salleable() {
        @Override
        public void sell(Human seller, Human buyer, Double price) {
            if(buyer.getCash()>=price) {
                if (seller.getPet() == null) {
                    System.out.println("nie mam na sprzedaż zwierza  ");
                } else {
                    System.out.println("e mam na sprzedaż");

                }

                if (seller.getMyCar() == null) {
                    System.out.println("nie mam na sprzedaż auta");
                } else {
                    System.out.println("mam na sprzedaż auta");
                    buyer.setCash(-price);
                    buyer.setMyCar(seller.getMyCar());
                    seller.setCash(+price);
                }

                if (seller.getPhone() == null) {
                    System.out.println("nie mam na sprzedaż komóry");
                } else {
                    System.out.println("mam na sprzedaż komóry");
                }
            }else {
                System.out.println("oj chyba jesteśmy biedni ");
            }


        }

    };

    public String toString() {

        return model + " " + price + " " + colour + " " + producer;
    }

    @Override
    public boolean turnOn() {
        System.out.println("odpalone");
        return true;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public String getColour() {
        return colour;
    }
}
