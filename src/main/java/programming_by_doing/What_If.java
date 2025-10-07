package programming_by_doing;

public class What_If {
    public static void main(String[] args) {
        int people = 30;
        int cats = 30;
        int dogs = 15;

        /// the if verify that the condition from the parantesis is true or false.
        /// in case of true condition, the code under the if statement will be executed
        if(people < cats) {
            System.out.println("To many cats! The world is doomed!");
        } else if(people > cats){
            System.out.println("Not many cats! The world is saved!");
        }
        /// in the curly braces is defined the code that will be executed if the condition is true

        if(people < dogs){
            System.out.println("The world is drooled on!");
        } else {
            System.out.println("The word is dry!");
        }

        dogs += 5;

        if(people >= dogs){
            System.out.println("People are greater than or equal to dogs!");
        } else if(people <= dogs){
            System.out.println("People are less than or equal to dogs!");
        } else if( people == dogs){
            System.out.println("People are dogs");
        }

    }
}
