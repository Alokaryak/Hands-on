package com.example.java_tuteDude.classes;

public class Smartphone {

    private String model_name;
    private String brand_name;
    private int price;
    private int screensize_inches;
    private String colour;

    public Smartphone() {
        //constructor in Java
        this.setBrand_name("Samsung");
        this.setColour("Black");
    }

    public Smartphone(String model_name, String brand_name, int price, int screensize_inches, String colour){
        this.model_name = model_name;
        this.brand_name = brand_name;
        this.price = price;
        this.screensize_inches = screensize_inches;
        this.colour = colour;

    }

    public void turnOn(){
        System.out.println("Smartphone is turning On");
    }

    public void turnOff(){
        System.out.println("Smartphone is turning Off");
    }

    public void call(){
        System.out.println("Smartphone is making a call");
    }

    public void details(){
        System.out.println("The model name is :: "+ model_name);
        System.out.println("The brand namme is :: "+ brand_name);
        System.out.println("The price is :: "+ price);
        System.out.println("The screen size of the phone is :: "+ screensize_inches);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getScreensize_inches() {
        return screensize_inches;
    }

    public void setScreensize_inches(int screensize_inches) {
        this.screensize_inches = screensize_inches;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
