package programming_by_doing;

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int guess;
        int ace;

        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                "He glances at you out of the corner of his eye and starts shuffling.\n" +
                "He lays down three cards.\n");
        System.out.println("Which one is the ace?\n" +
                "   ##  ##  ##\n" +
                "   ##  ##  ##\n" +
                "   1   2   3");
        System.out.print(">");

        guess = scanner.nextInt();
        ace = rand.nextInt(1, 4);


            if(ace == 1 && guess == ace){
                System.out.println("You nailed it! Fast Eddi reluctantly hands over your winnings, scowling.\n" +
                        "   " + "AA    " + "##   " + "##\n" +
                        "   " + "AA    " + "##   " + "##");
            } else if (ace == 2 && guess == ace){
                System.out.println("You nailed it! Fast Eddi reluctantly hands over your winnings, scowling.\n" +
                        "   " + "##    " + "AA    " + "##\n" +
                        "   " + "##    " + "AA    " + "##");
            } else if (ace == 3 && guess == ace){
                System.out.println("You nailed it! Fast Eddi reluctantly hands over your winnings, scowling.\n" +
                        "   " + "##    " + "##   " + "AA" + "\n" +
                        "   " + "##    " + "##   " + "AA");
            } else {
                if(ace == 1){
                    System.out.println("Ha! Fast Eddie wins again! The ace was card number 1.\n" +
                            "   " + "AA    " + "##   " + "##\n" +
                            "   " + "AA    " + "##   " + "##");
                } else if (ace == 2){
                    System.out.println("Ha! Fast Eddie wins again! The ace was card number 2.\n" +
                            "   " + "##    " + "AA    " + "##\n" +
                            "   " + "##    " + "AA    " + "##");
                } else if (ace == 3){
                    System.out.println("Ha! Fast Eddie wins again! The ace was card number 3.\n" +
                            "   " + "##    " + "##   " + "AA" + "\n" +
                            "   " + "##    " + "##   " + "AA");
                }
            }
    }
}
