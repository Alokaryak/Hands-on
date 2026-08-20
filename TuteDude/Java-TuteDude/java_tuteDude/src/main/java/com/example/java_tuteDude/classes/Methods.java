package com.example.java_tuteDude.classes;

public class Methods {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //println is a method, and "hello world" is an argument
        PrintSomething(); //calls the method. This was a method without an argument.
        PrintSomething("Alok"); //calls the method. This was a method with an argument.
        PrintSomething(69);
        MethodsNew.PrintSomething(29);
        MethodsNew.PrintSomething("Ashesh");
        MethodsNew.multiply(10,20);

        System.out.println("Multiplying 100 to the number 4 and result is :: "+MethodsNew.multiply100(4));
    }

    public static void PrintSomething() {
        System.out.println("Something!");
    }

    public static void PrintSomething(String name) {
        System.out.println("Someones Name ::"+ name);
    }

    public static void PrintSomething(int age) {
        System.out.println("Someones Age is ::"+ age);
    }

}
