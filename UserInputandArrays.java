import java.util.Scanner;

public class UserInputandArrays {
    public static void main(String[] args){

        // How to enter user input into an array.

        // First, the compiler needs to know the size of the array.

        // String[] foods = {"pizza", "taco", "hamburger"};
        // The size of this array are 3 elements.

        // empty array, size(length) = 0
        //String[] foods = {};

       /* Scanner scnr = new Scanner(System.in);

        System.out.print("Enter how much food you want: ");
        int userNum = scnr.nextInt();
        scnr.nextLine();

        String[] foods = new String[userNum];

        //foods[0] = "pizza";
        //foods[1] = "taco";
        //foods[2] = "hamburger";

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scnr.next();
        }

        for(String food : foods){
            System.out.println(food);
        }

        System.out.println(foods.length);

        scnr.close();*/












        // SEARCHING THROUGH THE ELEMENTS OF AN ARRAY
        // In DS&A we will be performing something that is called a LINEAR SEARCH.

        Scanner scnr = new Scanner(System.in);



        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        String[] fruits = {"apple", "orange", "banana"};

        // We are searching for the num 2.
        int target = 2;
        String target2 = "pie";
        boolean isFound = false;

        System.out.println("Enter a number to search for: ");
        target = scnr.nextInt();

        System.out.println("Enter a fruit to search for: ");
        target2 = scnr.next();

        for(int i = 0; i < numbers.length; i++){

            if(target == numbers[i]){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in the array");
        }
        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target2)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found");
        }

        // In DS&A we will be performing something that is called a LINEAR SEARCH.




    }
}
