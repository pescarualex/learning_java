package programming_by_doing;

import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number;
        int guess;

        System.out.print("I'm thinking of a number between 1-100. Try to guess it.\n" +
                "> ");
        guess = scanner.nextInt();
        number = random.nextInt(1,101);

        if(guess < number){
            System.out.println("Sorry, you are too low. I was thinking of " + number);
        } else if ( guess > number){
            System.out.println("Sorry, you are too high. I was thinking of " + number);
        } else {
            System.out.print("You guessed it! What are the odds?!?");
        }

    }
}
