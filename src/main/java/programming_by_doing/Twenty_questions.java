package programming_by_doing;

import java.util.Scanner;

public class Twenty_questions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answerOne;
        String answerTwo;

        System.out.println("Q1) Is it anumal. vegetable, or mineral? ");
        answerOne = scanner.nextLine();
        System.out.println("Q2) Is it bigger than  a breadbox? ");
        answerTwo = scanner.nextLine();

        if(answerOne.equalsIgnoreCase("animal") && answerTwo.equalsIgnoreCase("yes")){
            System.out.println("My guess is that you are thinking of a mouse.");
        } else if(answerOne.equalsIgnoreCase("animal") && answerTwo.equalsIgnoreCase("no")){
            System.out.println("My guess is that you are thinking of a squirrel");
        }

        if (answerOne.equalsIgnoreCase("mineral") && answerTwo.equalsIgnoreCase("yes")){
            System.out.println("My guess is that you are thinking of a Camaro");
        } else if (answerOne.equalsIgnoreCase("mineral") && answerTwo.equalsIgnoreCase("no")) {
            System.out.println("My guess is that you are thinking of a paper clip");
        }

        if(answerOne.equalsIgnoreCase("vegetable") && answerTwo.equalsIgnoreCase("yes")){
            System.out.println("My guess is that you are thinking of a watermelon");
        } else if(answerOne.equalsIgnoreCase("vegetable") && answerTwo.equalsIgnoreCase("no")){
            System.out.println("My guess is that you are thinking of a carrot");
        }

        System.out.println("I would ask you if I'm right, but I don't actually care.");

    }
}
