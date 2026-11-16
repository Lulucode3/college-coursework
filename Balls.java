public class Balls {

    String color;
    int height;
    double pounds;

    Balls(String color, int height, double pounds){
        this.color = color;
        this.height = height;
        this.pounds = pounds;
    }
    void ball(){
        System.out.println("The color of your ball is " + this.color + ".");
        System.out.print("The height is " + this.height);
        System.out.println(" and It weighs " + this.pounds + "lb.");
    }
}
