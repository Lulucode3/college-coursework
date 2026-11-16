import java.util.Scanner;

public class New {


        public static int getMonthAsInt(String monthString) {
            int monthInt;

            // Java switch/case statement
            switch (monthString) {
                case "January":
                    monthInt = 1;
                    break;
                case "February":
                    monthInt = 2;
                    break;
                case "March":
                    monthInt = 3;
                    break;
                case "April":
                    monthInt = 4;
                    break;
                case "May":
                    monthInt = 5;
                    break;
                case "June":
                    monthInt = 6;
                    break;
                case "July":
                    monthInt = 7;
                    break;
                case "August":
                    monthInt = 8;
                    break;
                case "September":
                    monthInt = 9;
                    break;
                case "October":
                    monthInt = 10;
                    break;
                case "November":
                    monthInt = 11;
                    break;
                case "December":
                    monthInt = 12;
                    break;
                default:
                    monthInt = 0;
            }

            return monthInt;
        }

        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);

            // TODO: Read dates from input, parse the dates to find the ones
            //       in the correct format, and output in m-d-yyyy format

            String userInput = scnr.nextLine();


            String[] userInput2 = userInput.split(" ");

            String userInput3 = userInput2[1];

            String extraction = userInput3.substring(userInput3.length()-2, userInput3.length()-1);

            String extraction2 = userInput3.substring(userInput3.length()-1);

            boolean isPresent;

            if(extraction2 != ","){
                isPresent = false;

            }


            int monthInt = getMonthAsInt(userInput2[0]);


            if(monthInt > 0 && monthInt < 13){
                System.out.println(monthInt + "-" + extraction + "-" + userInput2[2]);
            }


        }
}
