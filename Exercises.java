import java.util.Scanner;

public class Exercises {
    public static void main(String[] args){

       /* // Exercise #1

        String name = "Lisbeth";
        int age = 18;
        double gpa = 4.0;
        char grade = 'A';

        System.out.println("Hello " + name);
        System.out.println("You are " + age);
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Your average letter grade is " + grade);

        /* Within a single println (print line) state concatenate (combined)
        multiple variables.
         */
    /*
        String car = "Mustang";
        String color = "red";
        int year = 2025;
        char currency = '$';
        double price = 22222.22;
        boolean forSale = true;

        System.out.println("Your choice is a " + color + " " + year + " " + car);

        System.out.println("The price is: " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale.");
        }
        else{
            System.out.println("The " + car + " is not fro sale.");
        }

        Scanner scnr = new Scanner(System.in);

        System.out.print("How old are you?: ");
        int age2 = scnr.nextInt();

        System.out.println("You are " + age2 + " years old!");

        */

        //  EXERCISE #2

        // CALCULATE THE AREA OF A RECTANGLE

        //(One way you can do it is by separately declaring the variables data types.)

        //double width = 0;
        //double height = 0;
        //double area = 0;

        //Scanner scnr = new Scanner(System.in);
    /*
        System.out.print("Enter the width: ");
        double width = scnr.nextDouble();

        System.out.print("Enter the height: ");
        double height = scnr.nextDouble();

        double area = width * height;

        System.out.println("The area is: " + area + "cm²");//(²) = superscript


        scnr.close();

        */



        // EXERCISE #3
        // CALCULATING HYPOTENUSE C = Math.sqrt(a² + b²)
        /*
        Scanner scnr = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A");
        a = scnr.nextDouble();

        System.out.print("Enter the length of side B");
        b = scnr.nextDouble();

        c = Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));

        System.out.println("The hypotenuse (side c) is: " + c + "cm");

        */

        //Exercise #4

        // circumference = 2 * Math.PI * radius
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scnr = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scnr.nextDouble();

        circumference = 2 * Math.PI * radius;


        area = Math.PI * radius * Math.pow(radius, 2);

        volume = (4.0 / 3.0) * Math.PI * radius * Math.pow(radius, 3);


        System.out.printf("The circumference is: %.1fcm\n", circumference);

        System.out.printf("The area is: %.1fcm^2\n", area);

        System.out.printf("The volume is: %.1fcm^3\n", volume);







        scnr.close();
    }
}
