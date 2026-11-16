import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scnr.nextDouble();

        System.out.print("Convert to Celsius or Farenheit? (C or F): ");
        unit = scnr.next().toUpperCase();
        // We want the input to be uppercase, so in case the user entered
        // a lowercase we will automatically convert it into an uppercase by
        // doing something called method chaining. This is shown above when we
        // use the .toUpperCase(); method.

        // tenary ope rator formula = (condition) ? true : false

       newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp *  5 / 9) + 32;


        System.out.printf("%.1f°%s ☺", newTemp, unit);




        scnr.close();

    }
}
