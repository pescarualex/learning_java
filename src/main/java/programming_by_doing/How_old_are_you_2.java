package programming_by_doing;

import java.util.Scanner;

public class How_old_are_you_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Your name: ");
        name = scanner.nextLine();
        System.out.print("Your age: ");
        age = scanner.nextInt();

        if(age >= 25){
            System.out.println("You can do pretty much anything.");
        } else if(age > 18 && age < 25){
            System.out.println("You can vote but not rent a car.");
        } else if(age > 16 && age < 18){
            System.out.println("You can drive but not vote.");
        } else if(age < 16){
            System.out.println("You can't drive.");
        }
    }
}
