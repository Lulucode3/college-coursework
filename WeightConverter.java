import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM

        //Pseudocode = Writing comments each part of your
        //program describing what you are doing

        // Declare variables

        Scanner scnr = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        // Welcome message

        System.out.println("Weight Conversion Program");;
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // Prompt for user input / choice

        System.out.print("Chose an option: ");
        choice = scnr.nextInt();

        //option 1 convert lbs to kgs

        if(choice == 1){

            System.out.print("Enter the weight in lbs: ");
            weight = scnr.nextDouble();

            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        }
        else if(choice == 2){
            // option 3 convert kgs to lbs
            System.out.print("Enter the weight in kgs: ");
            weight = scnr.nextDouble();

            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        }
        else{
            // else print not a valid choice
            System.out.println("That was not a valid choice.");
        }

        scnr.close();


    }
}
