
public class Array {
    public static void main(String[] args){



    }
    public static int sum(int[] arr){

        int result = 0;

        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }
        return result;
    }
    public static int sum(int[] arr, int firstIndex, int lastIndex) {


        if(firstIndex < 0){
            return -666;
        }
        if(firstIndex >= arr.length ){
            return -666;
        }
        if(lastIndex < 0){
            return -666;
        }
        if(lastIndex >= arr.length){
            return -666;
        }
        if(lastIndex < firstIndex){
            return -666;
        }

        int result = 0;


        for(int i = firstIndex; i <= lastIndex; i++){

            result += arr[i];

        }
        return result;




    }
    public static double average(int[] arr){

        double result = 0;

        for(int i = 0; i < arr.length; i++){

            result += arr[i];

        }

        return result / arr.length;

    }
    public static double average (int[] arr, int firstIndex, int lastIndex){

        if(firstIndex < 0){
            return -666.0;
        }
        if(firstIndex >= arr.length ){
            return -666.0;
        }
        if(lastIndex < 0){
            return -666.0;
        }
        if(lastIndex >= arr.length){
            return -666.0;
        }
        if(lastIndex < firstIndex){
            return -666.0;
        }


        double result = 0.0;


        for(int i = firstIndex; i <= lastIndex; i++){

            result += arr[i];

        }
        return result / (lastIndex - firstIndex + 1);

    }
    public static int maxValue(int[] arr){

        int max = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > max){
                max = arr[i];
            }

        }
        return max;
    }
    public static int maxValue(int[] arr, int firstIndex, int lastIndex){

        if(firstIndex < 0){
            return -666;
        }
        if(firstIndex >= arr.length ){
            return -666;
        }
        if(lastIndex < 0){
            return -666;
        }
        if(lastIndex >= arr.length){
            return -666;
        }
        if(lastIndex < firstIndex){
            return -666;
        }

        int max = arr[0];

        for(int i = firstIndex; i <= lastIndex; i++){

            if(arr[i] > max){
                max = arr[i];
            }

        }
        return max;

    }
    public static int indexOfFirstMaxValue(int[] arr){

        int max = arr[0];

        int indexOfMax = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > max){
                max = arr[i];

                indexOfMax = i;

            }

        }
        return indexOfMax;

    }
    public static int indexOfFirstMaxValue(int[] arr, int firstIndex, int lastIndex){

        if(firstIndex < 0){
            return -1;
        }
        if(firstIndex >= arr.length ){
            return -1;
        }
        if(lastIndex < 0){
            return -1;
        }
        if(lastIndex >= arr.length){
            return -1;
        }
        if(lastIndex < firstIndex){
            return -1;
        }

        int max = arr[0];

        int indexOfMax = 0;

        for(int i = firstIndex; i <= lastIndex; i++){

            if(arr[i] > max){
                max = arr[i];

                indexOfMax = i;

            }

        }
        return indexOfMax;

    }
    public static int numberOfBelowAverageElements(int[] arr){

        double ave = average(arr);

        int count = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] < ave){
                count++;
            }

        }
        return count++;

    }
    public static int numberOfBelowAverageElements(int[] arr, int firstIndex, int lastIndex){

        if(firstIndex < 0){
            return -666;
        }
        if(firstIndex >= arr.length ){
            return -666;
        }
        if(lastIndex < 0){
            return -666;
        }
        if(lastIndex >= arr.length){
            return -666;
        }
        if(lastIndex < firstIndex){
            return -666;
        }




        double ave = average(arr);

        int count = 0;

        for(int i = firstIndex; i <= lastIndex; i++){

            if(arr[i] < ave){
                count++;
            }

        }
        return count++;

    }
    public static void rotateElements(int[] arr){

        int lastElement = arr[arr.length - 1];

        if(arr.length <= 1) {
            return;
        }

        for(int i = arr.length - 1; i > 0; i--){

            arr[i] = arr[i - 1];


        }

        arr[0] = lastElement;

    }
    public static void rotateElements(int[] arr, int rotationCount){



        if(arr.length <= 1) {
            return;
        }

        if(rotationCount < 0){
            return;
        }

        rotationCount = rotationCount % arr.length;



        for(int i = 0; i < rotationCount; i++){

            int lastElement = arr[arr.length - 1];

            for(int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = lastElement;
        }


    }
    public static void reverseArray(int[] arr){

        for(int i = 0; i < arr.length / 2; i++) {

            int result = arr[i];

            arr[i] = arr[arr.length - 1 - i];

            arr[arr.length - 1 - i] = result;
        }

    }

}
