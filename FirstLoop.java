public class FirstLoop {
    public static void main(String[] args) {
        int num = 1;

        while(num <= 50){
            if(num%2 == 0) {
                System.out.println(num + " is an even number");
            }
            else{
                System.out.println(num + " is an odd number");
            }

            if(num%2 == 0){
                System.out.println(num + " is divisible by 2");
            }
            else if(num%5 == 0){
                System.out.println(num + " is divisible by 5");
            }
            else if(num%8 == 0){
                System.out.println(num + " is divisible by 8");
            }
            else if(num%11 == 0){
                System.out.println(num + " is divisible by 11");

                num++;
            }
        }


    }
}
