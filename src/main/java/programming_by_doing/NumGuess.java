package programming_by_doing;

import java.util.Random;
import java.util.Scanner;

public class NumGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(1, 11);
        int choise;

        System.out.print("I'm thinking of a number from 1 to 10.\n" +
                "Your guess: ");
        choise = scanner.nextInt();

        if(choise == num){
            System.out.println("That's right! My secret number was " + num + "!");
        } else {
            System.out.println("Sorry, but I was really thinking of " + num + ".");
        }
    }
}
