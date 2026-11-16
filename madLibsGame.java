import java.sql.SQLOutput;
import java.util.Scanner; //importing Scanner class

public class madLibsGame {
    public static void main(String[] args){

        // MAD LIBS GAME

        Scanner scnr = new Scanner(System.in);

        /* If the variable is not assigned to a value (You did not put an "=")
        You are going to get a warning that he variable has not been initialized.
        initialize = set to the value or put in the condition appropriate to the start
        of an operation.
         */

        /*String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;*/

        System.out.print("Enter an adjective (description): ");
        String adjective1 = scnr.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        String noun1 = scnr.nextLine();
        System.out.print("Enter an adjective (description): ");
        String adjective2 = scnr.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        String verb1 = scnr.nextLine();
        System.out.print("Enter an adjective (description): ");
        String adjective3 = scnr.nextLine();

        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        // \n = escape sequence new line
        /*Prefix a new line character before displaying the story so that it's
        not so close to the prompts when outputting it.*/
        System.out.println("In an exhibit I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.print("I was " + adjective3);

        scnr.close();

    }
}
