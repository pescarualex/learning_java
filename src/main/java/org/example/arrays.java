package org.example;

import java.util.Arrays;

// o colectie de valori, toate de acelasi tip de date
// poti sa te gandesti la arrays ca la o variabila care poate sa stocheze mai multe date
public class arrays {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orage", "banana", "coconut"};

        //fruits[0] = "pineapple";
        int numOfFruits = fruits.length;

//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }

        //Arrays.sort(fruits);

        Arrays.fill(fruits, "pineapples");

        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        System.out.println(numOfFruits);
    }
}
