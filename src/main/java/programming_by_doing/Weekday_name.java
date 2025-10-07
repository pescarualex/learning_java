package programming_by_doing;

import java.util.Scanner;

public class Weekday_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weekdayNr;

        System.out.println("Please enter a numner and I will return the weekday: ");
        weekdayNr = scanner.nextInt();

        if(weekdayNr == 0){
            System.out.println("Today is Saturday");
        } else if(weekdayNr == 1){
            System.out.println("Today is Sunday");
        } else if(weekdayNr == 2){
            System.out.println("Today is Monday");
        } else if(weekdayNr == 3){
            System.out.println("Today is Tuesday");
        } else if(weekdayNr == 4){
            System.out.println("Today is Wednesday");
        } else if(weekdayNr == 5){
            System.out.println("Today is Thursday");
        } else if(weekdayNr == 6){
            System.out.println("Today is Friday");
        } else if(weekdayNr == 7){
            System.out.println("Today is Saturday");
        } else {
            System.out.println("error");
        }
    }
}
