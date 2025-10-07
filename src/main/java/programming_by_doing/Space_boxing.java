package programming_by_doing;

import java.util.Scanner;

public class Space_boxing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weight;
        double planet;

        System.out.print("Please enter your current earth weight: ");
        weight = scanner.nextInt();

        System.out.println("I have information for the following planets:\n" +
                "1. Venus   2. Mars   3. Jupiter\n" +
                "4. Saturn  5. Uranus 6. Neptune\n");

        System.out.print("Which planet are you visiting? ");
        planet = scanner.nextDouble();

        if(planet == 1){
            System.out.println("Your weight on Venus will be " + (weight * 0.78));
        } else if(planet == 2){
            System.out.println("Your weight on Mars will be " + (weight * 0.39));
        } else if(planet == 3){
            System.out.println("Your weight on Jupiter will be " + (weight * 2.65));
        } else if(planet == 4){
            System.out.println("Your weight on Saturn will be " + (weight * 1.17));
        } else if(planet == 5){
            System.out.println("Your weight on Uranus will be " + (weight * 1.05));
        } else if(planet == 6){
            System.out.println("Your weight on Neptune will be " + (weight * 1.23));
        } else {
            System.out.println("Error");
        }


    }
}
