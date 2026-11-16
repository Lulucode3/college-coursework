import java.util.Scanner;

public class Newer {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int count;

        int[] rounds = new int[4];

        for(int i = 0; i < rounds.length-1; i++){

            int[] userNums = scnr.nextInt();

            if(userNums[i] % 2 == 1){
                count++;
            }

        }
        System.out.println(count);








    }
}
