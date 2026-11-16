import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // for loop = executes a block of code a limited amount of times.

        // As long as 0 is less than 10, 1 will be added to 0
        /*for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("You have counted to 10!\n");

        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println("You have counted down to 0!\n");

        for(int i = 1; i <= 10; i ++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("You have counted all even nums 0-10!");

        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("HAPPY NEW YEARS!!!\n");

        int i = 10;
        while(i > 0){
            System.out.println(i);
            i--;
        }
        System.out.println("HAPPY NEW YEARS!!!\n");

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a vowel: ");
        char vowel = Character.toLowerCase(scnr.next().charAt(0));

        while(!(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')){
            System.out.println("Invalid\n Enter a vowel: ");
            vowel = scnr.next().charAt(0);
        }
        System.out.println("The vowel you entered is: " + vowel);
        */

        for(int i = 0; i < 101; i++){
            System.out.println(i);
        }

        for(int i = 0; i < 101; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("You have printed all even nums 0 - 100.");

        for(int i = -100; i < 101; i++){
            if(i % 5 == 0){
                System.out.println(i);
            }
        }
        System.out.println("You have printed all multiples of 5 from nums -100 - 100.");

        for(int i = -100; i < 101; i++){
            if(i % 5 == 0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("You have printed all nums from -100 - 100 while skipping all multiples of 5.");

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scnr.next();

        for(int i = 0; i < word.length(); i++){
            char currentCharacter = word.charAt(i);
            System.out.println(currentCharacter);
        }
        System.out.println("\n");

        for(int i = word.length() -1; i >= 0; i--){
            char CurrentCharacter2 = word.charAt(i);
            System.out.println(CurrentCharacter2);
        }

        System.out.println("\n");

        for(int i = 1; i < 100; i++){
            if(i%15 == 0){
                System.out.println("FIZZ BUZZ");
            }
            else if(i%5 == 0){
                System.out.println("BUZZ");
            }
            else if(i%3 == 0){
                System.out.println("FIZZ");
            }
            else{
                System.out.println(i);
            }
        }

       // System.out.println("\n");

        //System.out.println("enter a string: ");
        //String s1 = scnr.next();

        /*for(int i = 0; i < s1.length(); i++){
            char currentCharacter = Character.toLowerCase(s1.charAt(i));
            if(s1.contains("a") || s1.contains("e") || s1.contains("i") || s1.contains("o") || s1.contains("u")){

            }
        }*/

       /* Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = scnr.next();

       // for(int i = 0; i < string.length(); i++){
         //   if()
       // }*/








    }
}
