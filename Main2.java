import java.util.Scanner;

public class Main2 {
    public static void main (String[] args){


        //          ACCEPTING USER INPUT

        /* In order to accept user input we HAVE to
        get help from a scanner. */


        /*CLASS SCANNER(SCANNER) = An object that allows us
         * to accept user input in Java.
         *
         *
         * IN ORDER TO USE A SCANNER, it HAS to be imported from
         * the certain package called util(utilities).
         *
         * In order to do that we have to go to the top of the Java file
         * and write the following statement:
         *           import java.util.Scanner;
         * import = action being made    java = programming language
         * util(utility) = package       Scanner = class
         *
         *
         *               TO SUM UP PROGRAMMING
         *
         *    Accept input -> Process it -> Produce output
         *    That's why accepting user input is important*/

        Scanner scnr = new Scanner(System.in); // This activates the ability to give permission

        System.out.print("Enter your name: ");
        // next output will continue on the same line. (No ...ln)
        String name = scnr.nextLine(); // This gives the user permission to input.
        /* next line method of the scanner object reads a string of characters
        INCLUDING SPACES! To output everything before the first space write:
                        scnr.next();
                        INSTEAD OF:
                        scnr.nextLine();
        However if you use scnr.next(); whatever input comes after the first space
        will be left behind in the buff. So the computer will read the next input as
        the input after the first space.
         */

        //          HOW TO ACCEPT AN INTEGER

        System.out.print("Enter your age: ");
        int age = scnr.nextInt();

        System.out.println("Hello " + name);

        System.out.println("You are " + age + " years old!");


        //      ACCEPTING DOUBLES(Decimal points)


        System.out.print("What is your gpa?: ");
        double gpa = scnr.nextDouble();
        System.out.println("Your gpa is: " + gpa);


        //       ACCEPTING BOOLEANS

        // (THIS EXAMPLE IS NOT AN IF STATEMENT!)
        System.out.print("Are you a student? (True/False): ");
        boolean isStudent = scnr.nextBoolean();

        System.out.println("Student: " + isStudent);



        //(THIS EXAMPLE IS AN IF STATEMENT!)

        if(isStudent){
            System.out.println("You ARE enrolled as a student!");
        }
        else{
            System.out.println("You are NOT enrolled as a student!");
        }

        /* When you are finished accepting input you must close the scanner.
        It's like opening a file and closing it when you're done.
         */
        scnr.close();

        // Go to Exercise #2


        /*  SUMMARY OF ACCEPTING USER INPUT

        1) Create a Scanner object.

        2) Import the Scanner object.

        3) Close Scanner at the end of the program.

         */


    }
}
