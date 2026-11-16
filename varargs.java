public class varargs {
    public static void main(String[] args){

        // varargs (variable arguments) = allow a method to accept a varying # of arguments
        //                                 makes methods more flexible, no need for overloaded methods
        //                                  java will pack the arguments into an array
        //                                  ... (ellipsis)

        System.out.println(add(1, 2, 3, 4));

    }
    static int add(int... nums){
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
}
