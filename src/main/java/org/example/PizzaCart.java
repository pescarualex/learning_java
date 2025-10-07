package org.example;

import java.util.Scanner;

public class PizzaCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = "";
        double price = 0;
        int quantity = 0;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        scanner.nextLine();

        System.out.println("You have bought " + quantity + " " + item + "/s.");
        System.out.println("Your total is $" + price * quantity);

        scanner.close();
    }
}
