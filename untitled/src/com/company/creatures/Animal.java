package com.company.creatures;


import com.company.Salleable;

public abstract class Animal implements Feedable {

    public Salleable salleable;

    {
        salleable = new Salleable() {
            @Override
            public void sell(Human seller, Human buyer, Double price) {
                if (buyer.getCash() >= price) {
                    if (seller.getPet() == null) {
                        System.out.println("nie mam na sprzedaż zwierza  ");
                    } else {
                        System.out.println("e mam na sprzedaż");
                        buyer.setCash(-price);
                        buyer.setPet(seller.getPet());
                        seller.setCash(+price);
                    }

                    if (seller.getMyCar() == null) {
                        System.out.println("nie mam na sprzedaż auta");
                    } else {
                        System.out.println("mam na sprzedaż auta");
                    }

                    if (seller.getPhone() == null) {
                        System.out.println("nie mam na sprzedaż komóry");
                    } else {
                        System.out.println("mam na sprzedaż komóry");
                    }
                } else {
                    System.out.println("oj chyba jesteśmy biedni ");
                }


            }

        };
    }


    String species = "dog";
    private Double weight;

    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }

    public Animal() {
        this.weight = 9.0;
    }

   public void feed() {

       if(weight<18) {
           weight += 3;
           System.out.println("ulał się o 3 kg");

           System.out.println("My weight="+weight);
       }else{
           System.out.println("weź mnie wyprowadz bo zaraz zamiast psa bedzię świania");
       }
    }

  public   void takeForAWalk() {

      if(weight>0) {
          weight -= 3;
          System.out.println("oddyło mi sie 3 kg ");

          System.out.println("My weight="+weight);
      }else{
          System.out.println("ryju mordo sypnij szamom ");
        }
    }

    public String toString() {
        return species + " " + weight;
    }
}
