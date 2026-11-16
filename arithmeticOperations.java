public class arithmeticOperations {
    public static void main(String[] args) {

        // ARITHMETIC OPERATIONS

        //int x = 10;
        //int y = 3;
        //int z;

        // The result will be stored in z.

        //ADDITION
        //z = x + y;

        //SUBTRACTION
        //z = x - y;

        //MULTIPLICATION
        //z = x * y;         // "*" = asterisk

        //DIVISION
        //z = x / y;

        // MODULUS OPERATOR = % = THE REMAINDER OF ANY DIVISION
        //z = x % y;      // 10 divides by 2 evenly so the remainder is going to be 0.
        // "Z" STORES THE REMAINED THIS TIME INSTEAD OF THE RESULT.

        /* The modulus operator is useful if you need to determine
        whether a # is even or not, or when working with time you need
        to see if something is divisible by 60 or 60 mins.
         */

        //System.out.println(z);




        /* AUGMENTED ASSIGNMENT OPERATORS = Instead of storing the result
        in z, we are reassigning the result to variable x.
         */

        // Let's say we want to add x(10) and y(3), but store the result in x.
        //ADDITION
        //x = x + y;

        //Shortcut/Condense it
        //x += y;

        //SUBTRACTION
        //x = x -y;

        //Shortcut/Condense it
        //x -= y;

        //MULTIPLICATION
        //x = x * y;

        //Shortcut/Condense it
        //x *= y;

        //DIVISION
        //x = x / y;

        //Shortcut/Condense it
        //x /= y;

        // WHEN DIVIDING INT VALUES!
        /*Keep in mind that if the result is a double but
        the variables were declared as ints the result will be rounded
        into an int.
         */

        //MODULUS OPERATOR
        //x = x % y;

        //Shortcut/Condense it
        //x %= y;





        //INCREMENT AND DECREMENT OPERATORS

        //INCREMENT OPERATOR = a growth in value by a certain quantity

        int x = 1;

        //x = x + 1;

        //Shortcut/Condense it

        x++;
        x++;    // increments of 1
        x++;

        System.out.println(x);

        //Decrements = a decline in value by a certain quantity

        //DECREMENT OPERATOR

        //int x = 1;

        //x = x - 1;

        //Shortcut/Condense it

        x--;
        x--;
        x--;

        System.out.println(x);

        /* YOU WILL SEE MORE ABOUT INCREMENT AND DECREMENT OPERATORS
        WHEN YOU REACH THE TOPIC ON LOOPS.
         */




        // ORDER OF OPERATIONS [P-E-M-D-A-S]

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);



    }
}
