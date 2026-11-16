public class Hello {
    public static void main(String[] args){
        //System.out.println("Hello World!");

        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          it is a reference data type

        // Creating a Car object.

        Car car = new Car();

        // You can modify attributes
        //car.isRunning = true;

        // You need the dot operator or else it will print the memory address.
        // The dot operator will allow you to access things within an object.
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();

        Car car2 = new Car();

        // Both cars are currently identical although they are two seperate cars.
        System.out.println(car.make + " " + car.model);
        System.out.println(car2.make + " " + car2.model);



        //          This will help you to create two different cars

        // Constructors = A special method to initialize objects
        //                You can pass arguments to a constructor
        //                and set up initial values.

        Students stu = new Students("Spongebob", 30, 3.2);
        Students stu2 = new Students("Patrick", 34, 1.5);
        Students stu3 = new Students("Sandy", 27, 4.0);

        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.gpa);
        System.out.println(stu.isEnrolled);

        System.out.println(stu2.name);
        System.out.println(stu2.age);
        System.out.println(stu2.gpa);
        System.out.println(stu2.isEnrolled);

        System.out.println(stu3.name);
        System.out.println(stu3.age);
        System.out.println(stu3.gpa);
        System.out.println(stu3.isEnrolled);

        stu.study();
        stu2.study();
        stu3.study();



        /*Airplane air = new Airplane();

        System.out.println(air.color);
        System.out.println(air.poundsOfFood);
        System.out.println(air.seats);
        System.out.println(air.isOn);

        air.fly();
        System.out.println(air.isOn);
        air.land();
        System.out.println(air.isOn);
        air.turnLeft();
        System.out.println(air.isOn);
        air.turnRight();
        System.out.println(air.isOn);*/

        Airplane air2 = new Airplane("jetblue", 100, 50.5);
        Airplane air3 = new Airplane("Delta", 150, 45.5);
        Airplane air4 = new Airplane("Japan airline", 300, 80.5);

        System.out.println(air2.planeName);
        System.out.println(air2.passengerNum);
        System.out.println(air2.eatenFood);

        System.out.println(air3.planeName);
        System.out.println(air3.passengerNum);
        System.out.println(air3.eatenFood);

        System.out.println(air4.planeName);
        System.out.println(air4.passengerNum);
        System.out.println(air4.eatenFood);

        System.out.println();

        air2.flying();
        System.out.println();
        air3.flying();
        System.out.println();
        air4.flying();
        System.out.println();

        Chairs chair = new Chairs("white", 4, 5.5);

        System.out.println(chair.color);
        System.out.println(chair.legs);
        System.out.println(chair.height);

        System.out.println();

        Balls ball = new Balls("pink", 5, 5.5);

        System.out.println(ball.color);
        System.out.println(ball.height);
        System.out.println(ball.pounds);
        ball.ball();
        System.out.println();

        Balls ball2 = new Balls("white", 6, 5.3);

        System.out.println(ball2.color);
        System.out.println(ball2.height);
        System.out.println(ball2.pounds);
        ball2.ball();
        System.out.println();

        Balls ball3 = new Balls("blue", 3, 2.5);

        System.out.println(ball3.color);
        System.out.println(ball3.height);
        System.out.println(ball3.pounds);
        ball3.ball();
        System.out.println();


    }
}
