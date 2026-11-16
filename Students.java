public class Students {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // To build a constructor first type the name of the class.

    Students(String name, int age, double gpa){
        // This keyword refers to the object we are currently working with.
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }
    void study(){
        System.out.println(this.name + " is studying.");
    }
}
