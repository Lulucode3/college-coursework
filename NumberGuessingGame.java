import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        // NUMBER GUESSING GAME

        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 10;
        int randomNum = rand.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        // Do this code once while this condition remains true.
        // We will keep on playing util the guess the user makes is not = to the random num.

        do{

            System.out.print("Enter a guess: ");
            guess = scnr.nextInt();
            attempts++;

            if(guess < randomNum){
                System.out.println("TOO LOW! Try again");
            }
            else if(guess > randomNum){
                System.out.println("TOO HIGH! Try again");
            }
            else{
                System.out.println("CORRECT! The number was " + randomNum);
                System.out.println("# of attempts: " + attempts);
            }

        }while(guess != randomNum);



        scnr.close();


    }
}
