import java.util.Scanner;

public class BankingProgram {

// In the class scope we have to write that it is static because static methods
    // are using it.
    static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {

        // JAVA BANKING PROGRAM FOR BEGINNERS

        // DECLARE VARIABLES

        double balance = 0;

        boolean isRunning = true;

        int choice;

        while (isRunning){
            // DISPLAY MENU

            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            // GET AND PROCESS USERS CHOICE

            System.out.print("Enter your choice (1-4): ");
            choice = scnr.nextInt();

            switch (choice) {
                case 1: showBalance(balance); break;
                case 2: balance += deposit(); break;
                case 3: balance -= withDraw(balance); break;
                case 4: isRunning = false; break;
                default: System.out.println("INVALID CHOICE"); break;

            }
        }

        System.out.println("***************************");
        System.out.println("Thank you! have a nice day!");
        System.out.println("***************************");

        scnr.close();
    }
    // showBalance()
    public static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }

    // deposit()
    public static double deposit(){

        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scnr.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative.");
            return 0;
        }
        else{
            return amount;
        }

    }

    // withdraw()
    public static double withDraw(double balance){

        double amount;

        System.out.print("Enter the amount you would like to withdraw: ");
        amount = scnr.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}
