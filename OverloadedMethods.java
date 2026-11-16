public class OverloadedMethods {
    public static void main(String[] args){

        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters

        // In the argument first which method is it being sent to then what are we sending
        System.out.println(add(1, 2, 3, 4));

        // In this EX we are baking a pizza.

        String pizza = bakePizza("Flat Bread");

        System.out.println(pizza);

    }
    // the type of method, what data type it will return, method name
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static double add(double a, double b, double c,double d){
        return a + b + c + d;
    }




    // In this EX we are baking a pizza.

    // String is the return type.

    static String bakePizza(String bread){
        return bread + " pizza";
    }

}
