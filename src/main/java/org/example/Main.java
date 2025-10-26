package org.example;

import OOP.Car;
import OOP.Car2;
import OOP.Student;
import OOP.User;


public class Main {
    public static void main(String [] args){
//        Car car = new Car();
//        car.setModel("Ford");
//        car.setMake("Benza");
//        car.setYear(1231);
//        car.setPrice(12345.1234);
//        car.setRunning(false);
//
//        System.out.println(car.toString());


//        Student student1 =
//                new Student("SpongeBob",
//                        30, 3.2, true);
//        Student student2 =
//                new Student("Alex",
//                        29, 6.12, true);
//        System.out.println(student1.toString());
//        System.out.println(student2.toString());
//        Student student3 =
//                new Student("Florin",
//                        27, 4.0, true);
//        student1.study();
//        student2.study();
//        student3.study();


        //constructors overloading
//        User user1 = new User("John");
//        System.out.println(user1.toString());
//        User user2 = new User("John", "john@este.com");
//        System.out.println(user2.toString());
//        User user3 = new User("John", "john@este.com", 29);
//        System.out.println(user3.toString());
//        User user4 = new User();
//        System.out.println(user4.toString());


        //Array of objects
        Car2 car1 = new Car2("Mustang",  "red");
        Car2 car2 = new Car2("Corvete", "blue");
        Car2 car3 = new Car2("Charger", "Yellow");

        Car2[] cars = {car1, car2, car3};

        for(Car2 car : cars){
            System.out.println(car.toString());
            car.drive();
        }

    }
}