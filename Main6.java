import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        // Nested if statements = an if statement within an if statement.
        // Nested if statements are used when two conditions are true at the same time.
        // In this example the nested if statement will be if someone is both a student and
        // a senior they get both discounts.


        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent) {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            } else {
                System.out.println("You get a student discount of 10%");
                price = price *= 0.9;
            }
        }
        else{
                if (isSenior) {
                    System.out.println("You get a senior discount of 20%");
                    price *= 0.8;
                }
                else{
                    price *= 1;
                }

        }

        System.out.printf("The price of a ticket is: $%.2f\n", price);









        //DIFFERENT METHODS THAT CAN BE USED
        //String Methods

        //.length(); Method = How many characters are in one string?
        //.charAt(2); = Outputs the character that is in that index.
        //.indexOf("r"); = Outputs the index of the character.(remember, space counts as a character).
        //.lastIndexOf(); = The last index that contains that character.
        //.toUpperCase(); = All characters become uppercase.
        //.toLowerCase(); = All characters become lowercase.
        //.trim(); = Removes ALL whitespace before and after a string.
        //.replace("o", "a"); = Replaces a character within a string with another character.
        //System.out.println(name.isEmpty()); = boolean that checks if the variable is empty.
        //System.out.println(name.contains(" ")); = Checks if a the variable contains a certain value.(true/false)
        //name.equals("password") = checks if the characters within a variable are identical to whatever you put with in the
        //parenthesis. In this case we are checking if the characters within name are the same as in the string "password"
        // This method is case sensitive which means that even the casing has to be identical.
        //if(name.equalsIgnoreCase("password")){ = The same method as .equals, except the casing is ignored, so it is no
        //Longer case sensitive. So it will check if the strings are identical minus the casing.

        String name = "    Bro Code    ";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("o");

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("o", "a");



        System.out.println("\n" + length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
        System.out.println(name.isEmpty());
        System.out.println(name.contains(" "));

        if(name.isEmpty()){
            System.out.println("Your name is empty!");
        }
        else{
            System.out.printf("Hello %s\n", name);
        }
        if(name.contains(" ")){
            System.out.println("Your name contains a space!");
        }
        else{
            System.out.println("Your name must contain a space!");
        }
        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can not be password!");
        }
        else{
            System.out.printf("Hello %s\n", name);
        }








        //.substring() = A method used to extract a portion of a string
        //Create a new string using portions of the original or old string
        //              .substring(start, end)

        //String email = "Bro123@gmail.com";

        //String username = email.substring(0, email.indexOf("@"));

        //In this example we want to extract the "Bro123" portion of the email.
        //The first number will be the index where we want to start the extraction.
        //The second number will be one index after where we want to end the extraction.
        //This is because the second index that we chose is exclusive.

        //String domain = email.substring(email.indexOf("@") + 1); // +1 SUBTRACTS ONE CHARACTER FORM THE OUTPUT AND VICE VERSA.
        //You don't have to write the last index number if you want to use it.       ONLY FOR THE ENDING INDEX.
        //This is because it automatically gets the last index if you leave the second       FOR THE STARTING INDEX, IT IS NORMAL.
        //number empty

        //System.out.println(username);
        //System.out.println(domain);



        //ACCEPTING USER INPUT + USING THE SUBSTRING METHOD

        String email;
        String username;
        String domain;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter your email: ");
        email = scnr.nextLine();

        //Checking if the email is valid
        //An email is valid if it contains an "@" character.
        //The part of the email before the @ is the username.
        //The part of the email after the @ is the domain.
        //THIS IS CALLED AN EMAIL SLICER PROGRAM.

        if(email.contains("@")){

            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);

        }
        else{
            System.out.println("Emails must contain @");
        }








    }

}
