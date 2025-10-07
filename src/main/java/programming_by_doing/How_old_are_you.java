package programming_by_doing;

import java.util.Scanner;

public class How_old_are_you {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.print("What is your name?: ");
        name = scanner.nextLine();
        System.out.print("Ok, " + name + ", how old are you?: ");
        age = scanner.nextInt();

        if(age >= 25){
            System.out.println("You can do anything that is legal " + name);
        }
        if(age < 25){
            System.out.println("You can't rent a car " + name);
        }
        if(age < 18){
            System.out.println("You can't vote " + name);
        }
        if(age < 16){
            System.out.println("You can't drive " + name);
        }
    }
}
