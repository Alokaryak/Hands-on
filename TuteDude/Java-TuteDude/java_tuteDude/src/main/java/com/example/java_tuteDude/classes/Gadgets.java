package com.example.java_tuteDude.classes;

public class Gadgets {

    public static void main(String[] args) {

        Smartphone smartphone1; //declaration of variable to Java
        smartphone1 = new Smartphone(); //assigning value to the variable smartphone1; also this line calls the constructor of the class Smartphone

        smartphone1.setModel_name("S23 Ultra");
        smartphone1.setPrice(140000);
        smartphone1.setScreensize_inches(6);

        smartphone1.turnOn();
        smartphone1.details();
        smartphone1.turnOff();

        Smartphone smartphone2 = new Smartphone();
        smartphone2.setModel_name("A50");
        smartphone2.setPrice(15000);
        smartphone2.setScreensize_inches(5);

        smartphone2.turnOn();
        smartphone2.details();
        smartphone2.turnOff();

        Smartphone smartphone3 = new Smartphone("M50", "Samsung", 17000, 7, "white");
        smartphone3.turnOn();
        smartphone3.details();
        smartphone3.turnOff();
    }
}
