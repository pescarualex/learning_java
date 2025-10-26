package org.example;
import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.println("What item would you like to buy?: ");
        cart.setWhatToBuy(scanner.nextLine());
        System.out.println("What is the price for each?: ");
        cart.setPrice(scanner.nextDouble());
        System.out.println("How many would you like?: ");
        cart.setQuantity(scanner.nextInt());

        System.out.println("You have bought " + cart.getQuantity() +  " " + cart.getWhatToBuy() + "\n" +
                "Your total is $" + cart.totalCost(cart.getPrice(), cart.getQuantity()));
    }
}
