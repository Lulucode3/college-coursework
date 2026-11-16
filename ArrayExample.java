import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args){

        // array = A collection of values of the same data type
        //         * Think of it as a variable that can store more than 1 value *

        // Ex:

        // Each value within an array is known as an element.
        String[] fruits = {"apple", "orange", "banana", "coconut"};

        // You also have the ability to change the value of an element at a given index.
        // Ex:

        fruits[0] = "pinapple";

        // You can also get the length of an array.(How many elements there are)
        // Ex:

        int numOfFruits = fruits.length; // (Dot is the access modifier(to access the method))

        System.out.println(numOfFruits + "\n");

        // If you need to print all of the elements of an array you could use a for loop.
        // Ex:

        // OR             fruits.length
        for(int i = 0; i < numOfFruits; i++){
            System.out.println(fruits[i]);
        }

        System.out.println();

        // OR  You could use an Enhanced for loop. Also known as a for each loop.
        // It simplifies iterating through a collection such as an array.

        // Enhanced for loop = Will cycle once for every element within an array.
        // Ex:

        // First, list the datatype of the array.
        // Then, you need a unique identifier for each element within the array.
        // Finally, a colen and the name of the array.

        // It's basically saying for every fruit (element) within my array (of fruits) do this.

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // To access an element we have to indicate an index number.
        // Print out array of fruits at index of 0.(That'll give you the first element.
        System.out.println( "\n" + fruits[0]);
        // If you print an array you get a memory address.
        // This is because an array is a reference datatype.

        // PRIMITIVE                REFERENCE
        /*  int                     String
            double                  Array
            char                    Object
            boolean
         */

        // If you need to sort through an array there is a built in sort method.
        // Ex:

        System.out.println();

        // First, access the Arrays class.
        // Second import the class.
        // Third, put an access modifier.
        // Finally, access the sort method.

        Arrays.sort(fruits);
        // The sort method sorts String elements in alphabetical order.
        // numbers will be sorted in ascending order.

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // There is also a fill method you could use on arrays.
        // All of the elements will become the value you filled it with.

        // fill method allows you to fill all the elements of an array with a given value.
        // Ex:

        // First, access the arrays class.
        // Secondly, put an access modifier.
        // Thirdly, call the fill();
        // Fourthly, pass in the array.
        // Finally, comma and the value you want to fill the array with.

        // You fill the array of fruits with the value of pineapple.
        Arrays.fill(fruits, "pineapple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }


    }
}
