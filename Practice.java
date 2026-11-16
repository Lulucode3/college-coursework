import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Project 2 hints

        String s1 = "The quick brown BLANK1 jumps over the lazy BLANK2.";

        System.out.println("Enter a String: ");
        Scanner scnr = new Scanner(System.in);

        //accesing user input
        String userInput = scnr.nextLine();

        //converting it to an array, to easily grab the first and last words of
        String[] a1 = userInput.split(" ");

        //accessing the first and last words of the user input
        String firstWord = a1[0];
        String lastWord = a1[a1.length - 1];

        //replace BLANK1 with the firstword, and BLANK2 with the second word.

        String updatedString = s1.replace("BLANK1", firstWord);
        updatedString = updatedString.replace("BLANK2", lastWord);

        System.out.println(updatedString);
        System.out.println(s1); //string s 1 remains unchanged

        //printing out all elements of a1
        System.out.println(Arrays.toString(a1));
        System.out.println(firstWord);
        System.out.println(lastWord);


    }

}
