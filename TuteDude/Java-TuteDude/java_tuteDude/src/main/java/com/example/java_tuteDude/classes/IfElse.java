package com.example.java_tuteDude.classes;

public class IfElse {

    public static void main(String[] args) {

        boolean tired = true;
        if(tired) {
            System.out.println("Sleep please, as you are tired!");
        }else{
            System.out.println("You're energetic");
        }


        // == operator works as the equality operator of Maths
        if(5*2 == 80){
            System.out.println("The above calculation is correct!");
        }else{
            System.out.println("The above calculation is not correct!");
        }

        int marks = 60;
        if(marks >= 95){
            System.out.println("A+");
        }else if( marks >= 80){
            System.out.println("A");
        }else if( marks >= 70){
            System.out.println("B+");
        }else{
            System.out.println("B");
        }

        int money = 100;
        String car;
        if(money >= 80){
            car = "Audi";
        }else if(money >= 60){
            car = "Mercedes";
        }else if(money >= 40){
            car = "Hyundai";
        }else{
            car = "No car";
        }
        System.out.println("Car that can be brought is :: "+ car);

        int num = 8;
        if(num >= 5){
            if(num > 6){
                System.out.println("Big Number");
            }else{
                System.out.println("Number is either 5 or 6");
            }
        }
    }
}
