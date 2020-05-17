package com.company.creatures;


import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human {

    public Animal pet;
    private Car myCar;
    Double salary=250.0;
    double cash;
    Phone phone;


    Date date = new Date();

    public String toString() {
        return pet + " " + myCar + "  " + salary;
    }


    public Human() {
    }

    public void addMyCar(Car car) {
        this.myCar = car;
    }

    public Double setSalary(Double salary) {


        if (salary < 0) {
            System.out.println("sinako musi byc na +");
        } else {
            System.out.println("wypisuje informacje o tym, że nowe dane zostały wysłane do systemu księgowego ");
            System.out.println("wypisuje informację o konieczności odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println("wypisuje info, że ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu ");

            return this.salary = salary;
        }
        return this.salary = salary;
    }

    public Animal getPet() {
        return pet;
    }

    public Car getMyCar() {
        return myCar;
    }

    public void setMyCar(Car myCar) {
        if (salary >= myCar.price) {
            System.out.println("nowa furka jest posiadana!!!");
            addMyCar(myCar);
        } else if (salary > (myCar.price / 12)) {
            System.out.println("na kreche możesz kupić");
            addMyCar(myCar);
        } else {
            System.out.println("idz być biedakiem gdzie indziej");
        }
    }

    public Double getSalary() {
        System.out.println(date + " " + " " + salary);
        return salary;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public double getCash() {
        return cash + salary;
    }

    public void setCash(double cash) {
        this.cash = this.cash + cash;
    }

    public void setCash() {
        this.cash = cash + cash;
    }
}
