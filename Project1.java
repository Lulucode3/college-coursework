import java.util.Scanner;

public class Project1 {
    public static void main(String[] args){

        // Compound Interest Calculator

        Scanner scnr = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scnr.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scnr.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scnr.nextInt();

        System.out.print("Enter the number of years: ");
        years = scnr.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is %.2f", years, amount);

        scnr.close();

    }
}
