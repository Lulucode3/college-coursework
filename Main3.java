import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        // if statements = performs a block of code if its condition is true

        // In this example we will be checking if the user is an adult.
        //If so, we will print the message "You are an adult"

        Scanner scnr = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scnr.nextLine();

        System.out.print("Enter your age: ");
        age = scnr.nextInt();

        System.out.print("Are you a student? (True/False): ");
        isStudent = scnr.nextBoolean();

        // Group 1  // Checking if the user skipped the name question by leaving it blank

        if(name.isEmpty()){
            System.out.println("You didn't enter your name!");
        }
        else{
            System.out.println("Hello " + name + "!");
        }

        // Group 2
        if(age >= 65) {
            System.out.println("You are a senior!");
        }
        else if(age >= 18){
            System.out.println("You are an adult!");

        }
        else if(age < 0){
            System.out.println("You haven't been born yet!"); // Else if claus
        }
        else if(age == 0){ // "== is the comparison operator." If you use one = java thinks you're assigning a variable.
            System.out.println("You are a baby!");
        }
        else{
            System.out.println("You are a CHILD!!"); // This is called an else claus
        }


        // Group 3

        if(isStudent){
            System.out.print("You are a student!");
        }
        else{
            System.out.print("You are NOT a student!");
        }

        // The else claus is the default if none of the above conditions are true.
        // You can add as many else if clauses as you like.

        scnr.close();


    }
}
