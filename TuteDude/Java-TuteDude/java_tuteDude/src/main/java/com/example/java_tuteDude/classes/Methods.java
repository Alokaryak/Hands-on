package com.example.java_tuteDude.classes;

public class Methods {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //println is a method, and "hello world" is an argument
        PrintSomething(); //calls the method. This was a method without an argument.
        PrintSomething("Alok"); //calls the method. This was a method with an argument.
    }

    public static void PrintSomething() {
        System.out.println("Something!");
    }

    public static void PrintSomething(String name) {
        System.out.println("Someones Name ::"+ name);
    }
}
