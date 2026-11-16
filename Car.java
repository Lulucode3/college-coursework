public class Car {

    // Car attributes/qualities

    String make = "Ford";
    String model = "Mustand";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    // Defining methods = give action to.
    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }
    void drive(){
        System.out.println("You drive the " + model);
    }
    void brake(){
        System.out.println("You brake the " + model);
    }
}

