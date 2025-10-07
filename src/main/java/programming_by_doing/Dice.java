package programming_by_doing;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(1,7);
        int num2 = random.nextInt(1,7);
        int sum = num1 + num2;

        System.out.println("HERE COMES THE DICE!\n\n" +
                "Roll #1: " + num1 + "\n" +
                "Roll #2: " + num2 + "\n" +
                "The total is " + sum);

    }
}
