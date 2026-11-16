import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {

        // JAVA DICE ROLLER PROGRAM

        // DECLARING VARIABLES

        Scanner scnr = new Scanner(System.in);
        Random ran = new Random();

        int numOfDice;
        int total = 0;

        // GET THE NUMBER OF DICE FROM THE USER
        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scnr.nextInt();

        // CHECK OF NUMBER OF DICE IS GREATER THAN ZERO

        if(numOfDice > 0){
            // ROLL ALL THE DICE
            for(int i = 0; i < numOfDice; i++){
                int roll = ran.nextInt(1, 7);
                printDie(roll);
                // GET THE SUM
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        }
        else{
            System.out.println("# of dice must be greater than zero.");
        }



        scnr.close();
    }
    // DISPLAY THE ASCII ART OF DICE
    public static void printDie(int roll){
        String dice1 = """
                 -------
                |       | 
                |   ●   | 
                |       | 
                 -------
                """;


        String dice2 = """
                 -------
                | ●     | 
                |       | 
                |     ● | 
                 -------
                """;


        String dice3 = """
                 -------
                | ●     | 
                |   ●   | 
                |     ● | 
                 -------
                """;


        String dice4 = """
                 -------
                | ●   ● | 
                |       | 
                | ●   ● | 
                 -------
                """;


        String dice5 = """
                 -------
                | ●   ● | 
                |   ●   | 
                | ●   ● | 
                 -------
                """;


        String dice6 = """
                 -------
                | ●   ● | 
                | ●   ● | 
                | ●   ● | 
                 -------
                """;


        switch(roll){
            case 1: System.out.println(dice1); break;
            case 2: System.out.println(dice2); break;
            case 3: System.out.println(dice3); break;
            case 4: System.out.println(dice4); break;
            case 5: System.out.println(dice5); break;
            case 6: System.out.println(dice6); break;
            default: System.out.println("Invalid roll"); break;

        }
    }
}

