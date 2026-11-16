import java.util.Scanner;
import java.util.Arrays;

public class ArrayExamples2 {
    public static void main(String[] arg){

       /* int[] myArr = new int[10];
        int[] myArr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        myArr[0] = 1;

        System.out.println(Arrays.toString(myArr));
        System.out.println(Arrays.toString(myArr1));*/

        //Ex2:

        Scanner scnr = new Scanner(System.in);

        /*System.out.println("Enter the amount of nums elements do you want to store?: ");
        int amount = scnr.nextInt();
        //scnr.nextLine();

        //System.out.println("Enter the nums you want: ");
        //int numsEntered = scnr.nextInt();

        int[] useramount = new int[amount];
       // int[] userInts = new int[numsEntered];

        System.out.println("Enter the nums you want: ");
        for(int i = 0; i < amount; i++){
            useramount[i] = scnr.nextInt();
        }

       // storeUserIntArray(userInts, scnr);
        printIntArray(useramount);*/


        System.out.println("Enter the amount of nums you want: ");
        int numsWanted = scnr.nextInt();

        int[] capacity = new int[numsWanted];

        System.out.println("Enter the nums you want: ");

        for(int i = 0; i < numsWanted; i++){
            capacity[i] = scnr.nextInt();
        }
        printIntArray(capacity);

        int numsAbove100 = 0;

        for(int i = 0; i < numsWanted; i++){
            int currElement = capacity[i];
            if(currElement >= 100){
                numsAbove100++;
            }
        }

        System.out.println("The array has " + numsAbove100 + " values 100 or higher.");

        for(int i = 0; i < numsWanted; i++){
            //apacity[i] *= capacity[i];

            capacity[i] = (int) Math.pow(capacity[i], 2);

        }

        printIntArray(capacity);
        System.out.println();

        int num = 5;
        System.out.println(num);
        // Passby value (case for primitive types) + strings = copy of value when passed to a method.
        addFive(num);
        System.out.println(num);

        int [] nums = {1, 2, 3};
        printIntArray(nums);
        addFiveToFirstElement(nums);
        printIntArray(nums);

        scnr.close();
    }
    public static void printIntArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void storeUserIntArray(int[] array, Scanner scnr){
        for(int i = 0; i < array.length; i++){
            array[i] = scnr.nextInt();
        }
    }
    public static void addFive (int num){
        num = num + 5;

    }
    public static void addFiveToFirstElement(int[] array){
        array[0] += 5;
    }
}
