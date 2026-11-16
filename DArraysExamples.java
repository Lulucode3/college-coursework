public class DArraysExamples {
    public static void main(String[] args){

        // 2D array = An array where each element is an array.
        //            useful for stating a matrix of data.

        // Seperate 1D arrays
        String[] fruits = {"apple", "orange", "banana"};
        String[] veggies = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        //String[][] groceries = {fruits, veggies, meats};

        //                      OR

        String[][] groceries = {{"apple", "orange", "banana"}, {"potato", "onion", "carrot"}, {"chicken", "pork", "beef", "fish"}};

        // row colum
        groceries [0][0] = "pinapple";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.println(food + " ");
            }
            System.out.println();
        }


        // Mini project
    }
}
