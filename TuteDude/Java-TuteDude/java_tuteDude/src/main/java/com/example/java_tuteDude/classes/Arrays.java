package com.example.java_tuteDude.classes;

public class Arrays {

    public static void main(String[] args) {

//        int x = 100, 200;

        // Think array as a very big bucket which has multiple slots for putting the values!

        int arr[] = new int[20]; //20 here is the number of slots in the bucket
        // very big bucket, having multiple slots
        int[] arr1= new int[20];

        //How to add values in these arrays? in different slots.. slot1, slot2, slot3, slot4.... slot20!
        // counting of the slots start from zero (0)
        System.out.println("Value of slot in arr before assigning values to the slot :: "+arr[0]);
        arr[1] = 69;
        arr1[1] = 69;
        arr[0] = 33;
        arr1[0] = 43;

        arr1[2] = 123;
        arr[2] = 123;

        System.out.println("arr1[1] value is:: " + arr1[1]);
        System.out.println("arr[2] value is:: " + arr[2]);

        /**
         * The minimum index of the array will be 0
         * The maximum index of the array will be length of array - 1
         */

       //Another way of declaring an array!

       int arr10[] = new int[] {1,2,3,4};

        System.out.println("Second index of the element have value ::" + arr10[1]);

        String arrString[] = new String[]{"Alok", "Ashesh", "Aditya"};

        System.out.println("arrString second element is :: "+ arrString[1]);

        String[] arrString2 = new String[4];
        arrString2[0] = "Hello";
        arrString2[1] = "TuteDude,";
        arrString2[2] = "goodmorning!";
        arrString2[3] = "Whats the plan for the day?";
//        arrString2[4] = "STUDDDYYYY";

        System.out.println(arrString2[0]+arrString2[1]+ arrString2[2] + arrString2[3]);


    }
}
