package com.company.devices;

import com.company.creatures.Human;
import com.company.Salleable;

import java.util.List;

public class Phone extends Device {


    public String model;
    public static final String wersja = "Beta 1.0.205";
    public static final String nazwa = "NotNetflix";
    public static final String adres = "1241";
    public List<String> appList;
    public URL url;
    public static


    Salleable salleable = new Salleable() {
        @Override
        public void sell(Human seller, Human buyer, Double price) {
            if (buyer.getCash() >= price) {
                if (seller.getPet() == null) {
                    System.out.println("nie mam na sprzedaż zwierza  ");
                } else {
                    System.out.println("e mam na sprzedaż");

                }

                if (seller.getMyCar() == null) {
                    System.out.println("nie mam na sprzedaż auta");
                } else {
                    System.out.println("mam na sprzedaż auta");
                }

                if (seller.getPhone() == null) {
                    System.out.println("nie mam na sprzedaż komóry");
                } else {
                    buyer.setCash(-price);
                    buyer.setPhone(seller.getPhone());
                    seller.setCash(+price);
                }
            } else {
                System.out.println("oj chyba jesteśmy biedni ");
            }

        }


    };

    public Phone() {

    }

    public String toString() {
        return "";
    }

    @Override
    public boolean turnOn() {
        System.out.println("odpal komóre ");
        return true;
    }

    public String getModel() {
        return model;
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


    public void setModel(String model) {
        this.model = model;
    }
}
