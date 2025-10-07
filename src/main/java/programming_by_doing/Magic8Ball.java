package programming_by_doing;

import java.util.Random;

public class Magic8Ball {
    public static void main(String[] args) {
        Random randomNum = new Random();

        int num = randomNum.nextInt(1,6);

        String response = "";

        if(num == 1){
            response = "It is certain";
        } else if(num == 2){
            response = "It is decidely so";
        } else if(num == 3){
            response = "Without a doubt";
        } else if(num == 4) {
            response = "Yes - definitely";
        } else if(num == 5){
            response = "You may rely on it";
        }

        System.out.println(response);

    }
}
