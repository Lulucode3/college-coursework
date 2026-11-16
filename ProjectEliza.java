import java.util.Scanner;
// Import Scanner object.

// Youtube video Link: https://youtu.be/FJpGYNMKjOI

public class ProjectEliza {
    public static void main(String[] args){

        Scanner scnr = new Scanner(System.in);

        boolean running = true;

        while(running){
            // Initial greeting
            System.out.println("ELIZA:  Hello, my name is Eliza. What is your name?");


            System.out.print("USER:   ");
            String name = scnr.nextLine();

            System.out.println("ELIZA: Hello, " + name + ". Tell me what is on your mind today in 1 sentence.");



            boolean exit = false;
            while(!exit) {
                // Get user input
                System.out.print("USER: ");
                String userInput = scnr.nextLine();


                // Asking if the user want to run the session again or not.
                if(userInput.equalsIgnoreCase("EXIT")){
                    System.out.println("Do you want to run the session?");
                    String userInput2 = scnr.nextLine();
                    if(userInput2.equalsIgnoreCase("NO")){
                        exit = true;
                        running = false;
                        break;

                    }
                    else if(userInput2.equalsIgnoreCase("YES")){
                        exit = true;
                        break;

                    }

                }


                // Make each word within the response an element of an array.
                // Separate every word in the user's response.
                String[] response2 = userInput.split(" ");

                // locate the first element (the first word the user entered)
                String firstWord = response2[0];
                // locate the last element (the last word the user entered)
                String lastWord = response2[response2.length - 1];

                // Extracting the punctuation at the end of the user's response.
                String extraction = lastWord.substring(lastWord.length() -1);


                // Creating a PromptBank object.
                PromptBank pb = new PromptBank();
                // Call these methods or else the arrays will be empty and output null.
                pb.populateStatementsArray();
                pb.populateQuestionsArray();



                // If statement for the possible punctuations.
                 if (extraction.equals("?")) {
                    // Created a String variable for getting a random question.
                    String elizaResponse = pb.getRandomQuestionTrunk();

                    // Created another string variable to replace "BLANK1" with the first word of the user's statement.
                    String polish = elizaResponse.replace("BLANK1", firstWord);

                    lastWord = lastWord.replace("?", "");

                    // Created another string variable to replace "BLANK2" with the last word of the user's statement.
                    String FinalPolish = polish.replace("BLANK2", lastWord);

                    // print the final version
                    System.out.println("ELIZA: " + FinalPolish);


                } else if (extraction.equals("!")) {
                    // Created a String variable for getting a random question.
                    String elizaResponse = pb.getRandomStatementTrunk();

                    // Created another string variable to replace "BLANK1" with the first word of the user's statement.
                    String polish = elizaResponse.replace("BLANK1", firstWord);

                    lastWord = lastWord.replace("!", "");

                    // Created another string variable to replace "BLANK2" with the last word of the user's statement.
                    String FinalPolish = polish.replace("BLANK2", lastWord);

                    // print the final version
                    System.out.println("ELIZA: WOW! Dramatic! " + FinalPolish);


                }
                else{
                    // Created a String variable for getting a random statement.
                    String elizaResponse = pb.getRandomStatementTrunk();

                    // Created another string variable to replace "BLANK1" with the first word of the user's statement.
                    String polish = elizaResponse.replace("BLANK1", firstWord);

                    lastWord = lastWord.replace(".", "");

                    // Created another string variable to replace "BLANK2" with the last word of the user's statement.
                    String FinalPolish = polish.replace("BLANK2", lastWord);

                    // print the final version
                    System.out.println("ELIZA: " + FinalPolish);


                }

            }
        }




        scnr.close();
    }
}
