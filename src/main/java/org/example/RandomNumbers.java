package org.example;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int number;
        int n2;
        int n3;
        number = random.nextInt(1,7);
        n2 = random.nextInt(1,7);
        n3 = random.nextInt(1,7);
        System.out.println(number);
        System.out.println(n2);
        System.out.println(n3);

        System.out.println("/////doubles");

        double d1 = random.nextDouble();
        System.out.println(d1);


        System.out.println("/////boolean");
        boolean isHead = random.nextBoolean();
        System.out.println(isHead);


    }
}
