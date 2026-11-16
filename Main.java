import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.print("Hello World!");
        System.out.println("I like pizza!");

        //...println outputs into the  next line.

        //              or

        System.out.print("Hello World!");
        System.out.print("I like pizza!\n");

        /*...\n is an escape sequence which
        has the same function as ...println,
        so the output prints on the next line.
         */

        /* The shortcut for a method call statement
        (System.out.println();) is sout, tab.
        This shortcut ONLY applies for INTELLEJ
        (This current IDE).

        "IDE" stands for Integrated Development Environment.
         */






        /* Variables = A reusable container for a value.
                       A variable behaves as if it was the value in contains.

           Primitive = simple value stored directly in memory (stack)
           Reference = memory address (stack) that points to the (heap)

           primitive    vs      Reference
           ----------          ------------
           int                  string
           double               array
           char                 object
           boolean
         */


        /* 2 Steps to create a variable
        --------------------------------
        1. declaration
        2. assignment
         */


        // PRIMITIVE DATA TYPES

        // Data Type #1

        // Integer = Whole numbers



        //int age = 21;

        //System.out.println(age);



        /* In this example I FIRST declared
        the data type of the variable + the variable
                        (int age)

           SECONDLY, I assign (=) the variable a
           value + ; (Similar to English ".")
                        (21;)

           LASTLY, create a method call statement (System.out.print();) to
           output what was inputted in the previous steps.
         */


        //Examples:

        int age = 30;

        int year = 2025;

        int quantity = 3;

        System.out.println(age);




        // You can also input a method call statement + variable
        //               (String Concatenation)

        /* Data Type #2

        Double = A number that can contain a decimal portion.

         */
        //Examples:

        double price = 2.25;

        double gpa = 3.5;

        double temperature = -12.5;

        System.out.println(price);

        // String concatenation

        System.out.println("$" + price);

        /* If you assign a variable that's a double data type,
        but store an integer, it will be converted into a decimal.
        It will add .0 to the integer.

        Example:
                double price = 19

                System.out.println("Price: $" + price);

        Output:
               $19.0
         */




        // Data Type #3

        // char(character) = letter(A) or symbol(!).

        char grade = 'A';

        /* Unlike the other data types, the character
        assigned to the variable must
        be enclosed within single quote ('').
         */

        char symbol = '!';

        char currency = '$';

        System.out.println("Grade:" + grade);

        // boolean = Either true or false

        boolean isStudent = true;

        /* A common naming convention in java is called:
                   (Camelcase naming convention)
         */

        boolean forSale = false;

        boolean isOnline = true;

        // You can directly output a boolean:

        System.out.println(isStudent);

        //           BUT

        /* boolean variables are not typically
        output directly to the console
         */

        //          Instead

        /* They tend to be used internally within a program.
        For example: If statements
         */

        if(isStudent == true){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are NOT a student");
        }

        boolean isCrazy = false;
        if(isCrazy){
            System.out.println("You are crazy!");
        }
        else{
            System.out.println("You are NOT crazy!");
        }

        // Summary

        /* int age = 30;

        int year = 2025;

        int quantity = 1;

        double price = 19.99;

        double gpa = 3.5;

        double temperature = -12.5;

        char grade = 'A';

        char symbol = '!';

        char currency = '$';

        boolean isStudent = true;

        boolean isOnline = false;

        boolean forSale = true;

         */






        // REFERENCE DATA TYPE

        // String = a series of characters.

        String name = "Lisbeth";

        System.out.println(name);

        /* REMEMBER when using a series of characters (Strings)
        It will ALWAYS be double quotes ("").

        When you are using a character (char), it will ALWAYS
        be single quotes ('').

        Think of it like this. Multiple characters are used to
        create a String so "More quotes are used" (""). Only one SINGLE
        character is used to create a char, so you use SINGLE quotes ('').
         */



        // String Concatenation = Combining Strings and variables
        // For Example

        System.out.println("Hello " + name);

        String food = "pizza";

        String email = "fake123@gmail.com";
        // Numbers can be used in Strings,
        // but are considered characters
        String car = "Mustang";

        String color = "red";

        System.out.println("Your favorite food it: " + food);

        System.out.println("Your email is: " + email);

        // Go to Exercises to view Exercise #1.
        // Then go to Main2 to continue notes.


    }

}
