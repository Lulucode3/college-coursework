import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {

        // LOGICAL OPERATORS = ALLOWS US TO CHECK OR MODIFIY
        // MORE THAN ONE CONDITION.

        // && = AND
        // || = OR
        // ! = NOT

        /*double temp = 35;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD");
            System.out.println("It is sunny outside");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is GOOD");
            System.out.println("It is cloudy outside");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad");
        }
        */
        /*
        Scanner scnr = new Scanner(System.in);

        // Username must be between 4-12 characters
        // Username must not contain spaces or underscores

        String username;

        System.out.print("Enter your new username: ");
        username = scnr.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores.");
        }
        else{
            System.out.println("Welcome " + username);
        }

        scnr.close();

         */


        // while loop = repeat some code forever
        //              while some condition remains true

       /* Scanner scnr = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){

            System.out.print("Enter your name: ");
            name = scnr.nextLine();
        }

        System.out.println("Hello " + name);

        // Ex: You are playing a game and you want to quite.

        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game!");
            System.out.print("Press Q to quit: ");
            response = scnr.next().toUpperCase();
        }
        System.out.println("You have quite the game!"); */


        // Ex: Asking for the users age and they can not enter a negative number.

       /* int age = 0;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your age: ");
        age = scnr.nextInt();

        while(age < 0){
            System.out.println("Your age can not be negative!");
            System.out.println("Enter your age: ");
            age = scnr.nextInt();
        }

        System.out.println("You are " + age + " years old!"); */

        // Ex: Asking the user to enter a number.

       /* Scanner scnr = new Scanner(System.in);

        int num = 0;

        while(num < 1 || num > 10){
            System.out.print("Enter a number between 1 - 10: ");
            num = scnr.nextInt();
        }
        System.out.println("You picked " + num);*/

        // DO WHILE LOOP = CHECKING THE CONDITION AT THE END.
        // DO WHILE LOOP VERSION OF THE EXAMPLE ABOVE.

       /* Scanner scnr = new Scanner(System.in);

        int num = 0;
        // DO WHILE LOOP = DO THIS CODE ONCE THEN CHECK THE CONDITION.
        do{
            System.out.print("Enter a number between 1 - 10: ");
            num = scnr.nextInt();
        }while(num < 1 || num > 10);

        System.out.println("You picked " + num);*/

        // There are two variations of while loops
        // A STANDARD WHILE LOOP AND A DO WHILE LOOP.
        // IT DEPENDS IF YOU WANT TO CHECK THE CONDITION BEFORE ENTERING THE LOOP.


        // GO TO NUMBER GUESSING GAME!

        // FOR LOOP = execute some code a CERTAIN amount of times

        // Within a for loop there are 3 statements which are seprated using ";"
        // The first statment is used for initilazation
        // i, meaning index is used as a counter/loop control variable

        // The second statement is a condition(When do we want to stop)
        // We will continue this loop as long as i < 10.

        // The third statment is the step.
        // In this case, after each iteration i will go up by 1.

      /* for(int i = 10; i > 0; i-=3){
           System.out.println(i);
       } */

        // Ex: counting from one to a desired max.

       /* Scanner scnr = new Scanner(System.in);

        System.out.println("Enter how many times you want to loop: ");
        int max = scnr.nextInt();

        for(int i = 1; i <= max; i++){
            System.out.println(i);
        }
            */

        // Ex: Create a program that simulates a countdown.

        /*Scanner scnr = new Scanner(System.in);

        System.out.println("How many seconds to countdown from?:");
        int start = scnr.nextInt();

        // int i = start, which = 10 and as long as 10 > 0, 10 will decrease by 1.
        for(int i = start; i > 0; i--){
            System.out.println(i);
        }
        System.out.println("HAPPY NEW YEAR!"); */





        // BREAK = Break out of a loop (STOP)
        // CONTINUE = Skip current iteration of a loop (SKIP)

        // This will loop till 9. We will break out of the loop at 5.
        // When we continue rather than break, it will skip that iteration(2nd statement).
        // Continue skips a certain cycle of a loop.
        for(int i = 0; i < 10; i++){

            if(i == 5){
                break;
            }
            System.out.println(i + " ");
        }

        // NESTED LOOPS = A loop inside another loop
        //                used often within matrix or matrices or DS&A



        //scnr.close();


    }
}
