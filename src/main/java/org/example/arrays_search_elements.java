package org.example;

public class arrays_search_elements {
    public static void main(String[] args) {
        int[] numbers = {1,45,2,234,6,3,2,5,6,4,3};
        String[] fruits = {"apple", "orange", "banana"};
        int target = 6;
        String targetString = "orange";
        boolean isFound = false;
        boolean isFoundString = false;

        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Integer Founded! It is at index " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in array.");
        }

        System.out.println();

        for(int i = 0; i< fruits.length; i++){
            if(targetString.equals(fruits[i])){
                System.out.println("String Founded! It is at index " + i);
                isFoundString = true;
                break;
            }
        }

        if(!isFoundString){
            System.out.println("String not found in array.");
        }
    }
}
