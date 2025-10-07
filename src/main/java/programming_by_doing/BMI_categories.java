package programming_by_doing;

import java.util.Scanner;

public class BMI_categories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double heigght;
        double weight;
        double result;

        System.out.println("Your height in m: ");
        heigght = scanner.nextDouble();
        System.out.println("Your weight in kg: ");
        weight = scanner.nextDouble();

        result = weight / Math.pow(heigght, 2);

        System.out.println("Your BMI is " + result);

        if(result < 15){
            System.out.println("BMI category: very severely underweight");
        } else if(result >= 15 && result <= 16){
            System.out.println("BMI category: severely underweight");
        } else if(result >= 16.1 && result <= 18.4){
            System.out.println("BMI category: underweight");
        } else if(result >= 18.5 && result <= 24.9){
            System.out.println("BMI category: normal weight");
        } else if(result >= 25 && result <= 29.9){
            System.out.println("BMI category: overweight");
        } else if(result >= 30 && result <= 34.9){
            System.out.println("BMI category: moderately obese");
        } else if(result >= 35 && result <= 39.9){
            System.out.println("BMI category: severely obese");
        } else if(result >= 40){
            System.out.println("BMI category: very severely (or \"morbidly\" obese");
        }
    }
}
