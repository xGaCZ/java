package com.company;



public class Animal {


    String species="dog";
    private Double weight;

    public Animal() {
        this.weight = 10.0;
    }

    void feed(){


        if(weight<18) {
            weight += 3;
            System.out.println("ulał się o 3 kg");

            System.out.println("My weight="+weight);
        }else{
            System.out.println("weź mnie wyprowadz bo zaraz zamiast psa bedzię świania");
        }
    }

    void takeForAWalk(){

        if(weight>0) {
            weight -= 3;
            System.out.println("oddyło mi sie 3 kg ");

            System.out.println("My weight="+weight);
        }else{
            System.out.println("ryju mordo sypnij szamom ");
        }
    }

    public String toString(){
        return species+" "+weight;
    }
}
