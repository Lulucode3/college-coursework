import java.util.Scanner;

public class Grades {
    public static void main(String[] args){

        Scanner scnr = new Scanner(System.in);

        boolean isrunning = true;
        int count;

        int[] grades = new int[100];

        count = readGrades(grades);



            if(count == 0) {
                System.out.println("No grades entered.");
                return;
            }

            int[] realGrades = new int[count];
            for(int i = 0; i < count; i++) {
                realGrades[i] = grades[i];
            }
            System.out.println("Number Of Grades = " + count);
            System.out.println("Maximum Exam Grade = " + maxValue(realGrades));
            System.out.println("Minimum Exam Grade = " + minValue(realGrades));

            System.out.println();


    }
    public static int readGrades(int[] grades){

        Scanner scnr = new Scanner(System.in);

        int count = 0;
        boolean running = true;

        while(running){
            System.out.println("Enter a grade :");
            int grade = scnr.nextInt();

            if(grade <= 0){
                break;
            }

            grades[count] = grade;
            count = count + 1;

            if(count == grades.length){
                break;
            }
        }
        return count;
    }
    public static int sum(int[] arr){
        int total = 0;

        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        return total;
    }
    public static int sum(int[] arr, int firstIndex, int lastIndex){
        if(firstIndex <= -1 || lastIndex >= arr.length || firstIndex > lastIndex){
            return -666;
        }
        int total = 0;
        for(int i = firstIndex; i <= lastIndex; i++){
            total = total + arr[i];
        }
        return total;
    }
    public static double average(int[] arr){
        double average = sum(arr) * 1.0 / arr.length;
        return average;
    }
    public static int maxValue(int[] arr, int firstIndex, int lastIndex){
        if(firstIndex < 0 || lastIndex >= arr.length || firstIndex > lastIndex){
            return -666;
        }
        int maximum = arr[firstIndex];
        for(int i = firstIndex; i <= lastIndex; i++){
            if(arr[i] > maximum){
                maximum = arr[i];
            }

        }
        return maximum;
    }
    public static int indexOfFirstMaxValue(int[] arr){
        int maximum = arr[0];
        int index = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i]>maximum){
                maximum = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static int minValue(int[] arr, int firstIndex, int lastIndex){
        if(firstIndex <= -1 || lastIndex >= arr.length || firstIndex > lastIndex){
            return -666;

        }
        int minimum = arr[firstIndex];
        for(int i = firstIndex; i <= lastIndex; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
    public static int indexOfFirstMinValue(int[] arr){
        int minimum;
        int index = 0;
        minimum = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
                index = i;
            }
        }

        return index;

    }
    public static int numberOfBelowAverageElements(int[] arr){
        double average;
        int count = 0;
        average = average(arr);

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < average){
            count = count + 1;
            }
        }
        return count;
    }
    public static int numberOfAboveAverageElements(int[] arr){
        double average;
        int count = 0;

        average = average(arr);

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > average){
                count++;
            }
        }
        return count;
    }
    public static void rotateElements(int[] arr){
        rotateElements(arr, 1);
    }
    public static void rotateElements(int[] arr, int rotationCount){
        rotationCount %= arr.length;

        if(rotationCount == 0){
            return;
        }
        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            temp[(i + rotationCount) % arr.length] = arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }

    }
    public static void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;

            left++;
            right--;
        }

    }
    public static int maxValue(int[] arr){
        return maxValue(arr, 0, arr.length - 1);


    }
    public static int minValue(int[] arr){
        return minValue(arr, 0, arr.length - 1);
    }

}
