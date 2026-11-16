import java.util.Scanner;

public class Main9 {
    public static void main (String[] args) {

        // Nested Loops = A loop inside another loop
        //                Used often with matrices or DS&A

        // DRY = DON'T REPEAT YOURSELF

        // If we have a nested loop we can not have we can't use the same index.
        // A common naming convention used for nested loops is to use an index of j
        // rather than i since j comes next in the alphabet after i.

        // In this example we are printing #'s 1 -9 3x
        // In other words a matrix of data.

        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }

        // MINI PROJECT = Create a matrix of a symbol that the user inputs.
        // The user will set the amount of rows and columns that they want.

        Scanner scnr = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the amount of rows: ");
        rows = scnr.nextInt();

        System.out.print("Enter the amount of columns: ");
        columns = scnr.nextInt();

        System.out.print("Enter the symbol: ");
        symbol = scnr.next().charAt(0);

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();

        }

        // Method = a block of reusable code that is executed when called ()
        // To call a method you used a set of parenthesis.
        // You can write some code once and reuse it as many times as you'd like.
        // You just have to call it.

        // In this example we want to sing a happy birthday song 3x.
        // Without a method we would have to write the same block of code
        // 3x, but with methods we only have to write it once.


        // Without creating a Method
        /*System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday to you!");
        System.out.println("You are x years old!");
        System.out.println("Happy Birthday to you!\n");

        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday to you!");
        System.out.println("You are x years old!");
        System.out.println("Happy Birthday to you!\n");

        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday to you!");
        System.out.println("You are x years old!");
        System.out.println("Happy Birthday to you!\n");*/

        // This is how you call the method you created.
        // Think of the parenthesis as 2 telephones.

        String name = "Bro";
        int age = 25;

        // Anything that you send a method is called an argument.
        happyBirthday(name, age);


        scnr.close();
    }
    // We are now outside of the main method block
    // A method can return something
    // In this example the return type is void
    // The name of the method is happyBirthday.

    // Normally you don't have to add the key word static but because we are working withing
    // another method already and the type of method is static we also have to
    // make this type of method static as well.

    // While the parenthesis are blank, the method is not set up to receive arguments.
    // When they are filled what's inside is called parameters.
    // We NEED a set of parameters that match the argument.
    // First, write the data type of what you are receiving.
    // Then, name what you are receiving. The name doesn't have to be the same as
    // argument but naming it the same help minimize confusion.

    // The data type and the order of the parameters are important.
    static void happyBirthday(String name, int age){

        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");

        // variables used within other methods can only be found within
        // the methods in which they were created.

        //              IN OTHER WORDS

        // Methods are not familiar with variables inside of other methods.
        // Think of methods as houses.
        // If will live in one house we can't see in our neighbors house.

        //                     BUT
        //             THERE IS ANOTHER WAY

        // By passing ARGUMENTS FROM ONE METHOD TO ANOTHER.

        // ARRGUMENTS = From one method we can send information to another method.


    }
}
