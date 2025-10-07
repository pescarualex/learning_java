package org.example;

public class AritmeticOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        int z;

        //z = x + y;
        //z = x - y;
        //z = x * y;
        //z = x / y;
        //z = x % y;


        /// Augumented assignmennt operators
        x = x + y;
        x += y;

        /// increment and decrement operators
        x++; //increment x by 1 and return
        y++; //increment y by 1 and return
        ++x; //return x and increment by 1
        ++y; //return y and increment by 1

        x--;
        y--;
        --x;
        --y;



        System.out.println(x);
    }
}
