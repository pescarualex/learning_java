package org.example;

import java.util.Scanner;

public class arrays_user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfFood;
        System.out.print("What # of food do you want?: ");
        numOfFood = scanner.nextInt();
        scanner.nextLine();

        String[] food = new String[numOfFood];

        for(int i = 0; i < food.length; i++){
            System.out.print("Enter a food: ");
            food[i] = scanner.nextLine();
        }

        for(String eat : food){
            System.out.println(eat);
        }
        scanner.close();

    }
}
