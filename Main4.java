import java.util.Random; // This is called a random module

public class Main4 {
    public static void main(String[] args) {

        // RANDOM NUMBERS INT (Generate random numbers)

        Random rand = new Random();

        int number1;
        int number2;
        int number3;

        number1 = rand.nextInt(1,101);
        number2 = rand.nextInt(1,101);
        number3 = rand.nextInt(1,101);
        // The random # that will be generated will be -2B - +2B.
        // This mean you have to create a bound
        // The first # is inclusive and the second is exclusive


        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);



        // RANDOM NUMBERS Double (Generate random numbers)

        double num;

        num = rand.nextDouble(1,101);

        System.out.println("\n \n" + num);



        // RANDOM NUMBERS Boolean (Generate random numbers)
        // Generating random #'s with Boolean data type
        //can be used for coin flip.
        // Ex below = coin flip simulator

        boolean isHeads;

        isHeads = rand.nextBoolean();

        //System.out.println(isHeads);

        if(isHeads){
            System.out.print("HEADS");
        }
        else{
            System.out.print("TAILS");
        }




        // MATH CLASS
        // THE POWER METHOD

        //REMEMBER THESE ARE MATH CONSTANTS!!! NOT METHODS!!!
        System.out.println("\n \n" + Math.PI);
        System.out.println(Math.E); // Exponential constant (Euler's number)

        double result;

        result = Math.pow(2, 3); // Raising the base of 2 to the power of 3

        System.out.println(result);



        //REMEMBER THESE ARE MATH METHODS!!! NOT CONSTANTS!!!

        // THE ABSOLUTE VALUE METHOD

        result = Math.abs(-5);

        System.out.println(result);


        // SQUARE ROOT METHOD

        result = Math.sqrt(9);

        System.out.println(result);

        //ROUNDING # (To the nearest whole INT)

        result = Math.round(3.14); // Will round the number to the nearest INT

        System.out.println(result);

        // CEILING METHOD (To always round up)

        result = Math.ceil(3.14);

        System.out.println(result);

        // FLOOR METHOD (To always round down)

        result = Math.floor(3.14);

        System.out.println(result);

        // Max between 2 values (or variables)

        result = Math.max(10, 20);

        System.out.println(result);

        // Min between 2 values (or variables)

        result = Math.min(10, 20);

        System.out.println(result);

        // GO TO EXERCISE #3 and #4
    }
}
