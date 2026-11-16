import java.util.Scanner;

public class CopenhagenTransit {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double fare;

        System.out.println("Enter zone number :");
        int zoneNum = scnr.nextInt();
        scnr.nextLine(); // consume newline

        System.out.println("Enter adult or child :");
        String ticketType = scnr.nextLine();

        if(zoneNum <= 2 && ticketType.equalsIgnoreCase("adult")){
            fare = 23.0;
        }
        else if(zoneNum <= 2 && ticketType.equalsIgnoreCase("child")){
            fare = 11.5;
        }
        else if(zoneNum == 3 && ticketType.equalsIgnoreCase("adult")){
            fare = 34.5;
        }
        else if((zoneNum == 3 || zoneNum == 4) && ticketType.equalsIgnoreCase("child")){
            fare = 23.0;
        }
        else if(zoneNum == 4 && ticketType.equalsIgnoreCase("adult")){
            fare = 46.0;
        }
        else {
            fare = -1.0;
        }

        System.out.println("The fare for " + ticketType.toLowerCase() + " to zone number " + zoneNum + " is " + fare + ".");
    }
}
