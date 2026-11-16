public class Airplane {
    String color = "pink";
    int seats = 100;
    double poundsOfFood = 100.50;
    boolean isOn = false;


    void fly(){
        isOn = true;
        System.out.println("The airplane is flying.");
    }
    void land(){
        isOn = false;
        System.out.println("The airplane has landed and is now off.");
    }
    void turnLeft(){
        isOn = true;
        System.out.println("The airplane is turning Left.");
    }
    void turnRight(){
        isOn = true;
        System.out.println("The airplane is turning right.");
    }

    String planeName;
    int passengerNum;
    double eatenFood;
    boolean isWorking;

    Airplane(String planeName, int passengerNum, double eatenFood){
        this.planeName = planeName;
        this.passengerNum = passengerNum;
        this.eatenFood = eatenFood;

    }
    void flying(){
        System.out.println(this.planeName + " is flying around the world.");
        System.out.println("There are currently " + this.passengerNum + " passengers aboard who have at this moment eaten " + this.eatenFood);
        System.out.println("I hope you all enjoy your flight!");
        System.out.println("Thank you!");
    }
}
