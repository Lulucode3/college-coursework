import java.util.Scanner;

public class Main7 {
    public static void main(String[] args){

        // Ternary operator ? = Return 1 of 2 values if a condition is true

        // Variable = (condition) ? ifTrue : ifFalse:

        // This how we could tell if someone passes or not
        // using if statements
        /*int score = 70;

        if(score >= 60){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        } */

        // This how we could tell if someone passes or not
        // using the ternary operator.

        int score = 75;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL"; // The colin(:) means otherwise.

        System.out.println(passOrFail);

        // Simpler Example
        // Checking if the number is even or odd.

        int num = 4;

        String evenOrOdd = (num % 2 == 0) ? "EVEN" : "ODD";

        System.out.println(evenOrOdd);

        // Practical Example

        int hours = 9;

        String timeOfDay = (hours > 12) ? "P.M." : "A.M.";

        System.out.println(timeOfDay);

        // Last Example

        int income = 30000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);

        // ENHANCED SWITCHES = a replacement to many else if statements
        //                     (Java14 feature)

        // *RECOMMENDATION = Use enhanced switches over standard switches.

        Scanner scnr = new Scanner(System.in);

        String day;

        System.out.print("Enter the day of the week: ");

        day = scnr.nextLine();

        // The arrow operator in java means something. In this example in the case if
        // day is Monday print this.

        switch(day.toLowerCase()){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is  a weekday.");
            case "Saturday", "Sunday" ->
                    System.out.println("It is a weekend.");
            default -> System.out.println(day + " is not a day.");

            // Go to MyCalculator2

        }






    }
}
