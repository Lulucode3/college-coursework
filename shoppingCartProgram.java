import java.sql.SQLOutput;
import java.util.Scanner;

public class shoppingCartProgram {
    public static void main(String[] args) {

        // SHOPPING CART PROGRAM

        Scanner scnr = new Scanner(System.in); // REMEMBER! This is called a SCANNER OBJECT!
                                               // The action being made is called opening a scanner.
         String item;
         double price;
         int quantity;
         char currency = '$';
         double total;

        System.out.print("What item would you like to buy: ");
        item = scnr.nextLine();

        System.out.print("What is the price of the item: ");
        price = scnr.nextDouble();

        System.out.print("How many would you like: ");
        quantity = scnr.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);
        scnr.close();

    }
}
