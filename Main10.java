

public class Main10 {

    static int x = 3; // CLASS SCOPE
    // CLASS SCOPES ARE RECOGNIZED THROUGHOUT THE ENTIRE CLASS.

    // CLASS SCOPES ARE THE STREETS!

    // YOU AND YOUR NEIGHBORS CAN NOT SEE INSIDE EACH OTHERS HOUSES
    // FROM WITHIN YOUR HOMES       BUT     YOU AND YOUR NEIGHBORS
    // CAN LOOK OUTSIDE AND SEE THE STREETS FROM WITHIN YOUR HOMES!

    public static void main(String[] args) {

        // If there is a local variable java will use it
        // rather than the class variable
        // it likes to use local variables first

        System.out.println(x);

        // method = a bloch of reusable code that is executed when called ()

        // This is called CALLING A METHOD!
        double result = square(3);
        System.out.println(result);
        //         OR
        System.out.println(square(3));
        // Since we are calling a method that's not static from one that is we have to
        // make the method that is not static, static. (static modifier).
        double result2 = cube(2);
        System.out.println(result2);


        String fullName = getFullName("Bro", "Code");
        System.out.println(fullName);

        int age = 5;

        if(ageCheck(age)){
            System.out.println("You may sign up!");

        }
        else{
            System.out.println("You must be 18+ to sign up!");
        }

        // Variable scope = share a variable can be accessed

        //              THERE ARE TWO LEVELS

        //                LOCAL AND CLASS


        // when you declare a variable inside a method it is called a local scope.
        // EX:
        int x = 1; // LOCAL SCOPE

        System.out.println(x);

        doSomething();

        // The variable that we just created ONLY EXISTS WITHIN THE BODY OF THE
        // METHOD IT WAS CREATED IN. In this case the main method. THAT MEANS THAT
        // THIS VARIABLE WILL NOT BE RECOGNIZED(WORK) IN OTHER METHODS.

        // THAT'S WHY IF WE DO WANT TO USE THIS VARIABLE IN ANOTHER METHOD WE HAVE TO
        // PASS IT DOWN AS AN ARGUMENT.

    }
    static void doSomething(){
        int x = 2; // LOCAL
        System.out.println(x);
    }
    static double square(double num){
        return num * num;
    }
    static double cube(double num){
        return num * num * num;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    // The return keyword will return a value after the method ends.
    // It will return that value back to the place in which you called that method.

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }

    }

}
