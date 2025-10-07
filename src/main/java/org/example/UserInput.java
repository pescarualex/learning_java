package org.example;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ytour name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();
        System.out.print("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your GPA is " + gpa);

        if (isStudent) {
            System.out.println("You are enrolled as a student.");
        } else {
            System.out.println("You are not enrolled");
        }

        //common issues
        System.out.println("Enter your age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your favorite color");
        String color = scanner.nextLine();

        System.out.println("You are " + age2 + " years old.");
        System.out.println("You like " + color);
//
//        scanner.close();


        //calculate area of a rectangle
        double width = 0;
        double height = 0;
        double area = 0;

        //Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a width: ");
        width = scanner.nextDouble();
        System.out.print("Enter a height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("The area is " + area + "^2");

        scanner.close();

    }
}
