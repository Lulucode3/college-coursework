import java.util.Scanner;

public class FinalExamAnswers {

    static Scanner scnr = new Scanner(System.in);

    public static void main(String [] args){
        manipulateString();
    }
    public static void manipulateString(){

        System.out.println("Enter a sentence: ");
        String userInput = scnr.nextLine();

        String splitUserInput[] = userInput.split(" ");


        String lastWord = splitUserInput[splitUserInput.length - 1];
        String firstWord = splitUserInput[0];

        System.out.println(lastWord);

        System.out.println();

        System.out.println(firstWord);

        for(int i = 0; i < splitUserInput.length; i++){
            if(i%2 == 0) {
                System.out.print(splitUserInput[i].toUpperCase() + " ");
            }
            else{
                System.out.print(splitUserInput[i] + " ");
            }
        }

        System.out.println();

        for(int i = splitUserInput.length - 1; i > -1; i--){
            if(splitUserInput[i] == firstWord){
                System.out.println(splitUserInput[i].toUpperCase());
            }
            else if(i%2 == 0) {
                System.out.print(splitUserInput[i].toUpperCase() + " ");
            }
            else{
                System.out.print(splitUserInput[i].toLowerCase() + " ");
            }
        }

        System.out.println();

        System.out.println(lastWord);

        System.out.println();

        System.out.println(firstWord);

        //An apple a day keeps the doctor away.
    }

}