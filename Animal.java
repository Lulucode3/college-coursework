public class Animal {
    private String name;
    private int birthYear;
    private double weight;
    private char gender;

    public Animal(){
        this.name = "";
        this.birthYear = 1900;
        this.weight = 0.0;
        this.gender = 'u';
    }
    public Animal(String name, int birthYear, double weight, char gender){
        this.name = name;
        this.birthYear = birthYear;
        setWeight(weight);
        setGender(gender);


    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    public double getWeight(){
        return weight;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        if(gender == 'm' || gender == 'f'){
            this.gender = gender;

        }
        else{
            this.gender = 'u';
        }
    }
    public int calculateAge(int currentYear){
        if(currentYear < birthYear){
            return -1;
        }
        return currentYear - birthYear;
    }
    public boolean isMale(){
        if(gender == 'm'){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFemale(){
        if(gender == 'f'){
            return true;
        }
        else{
            return false;
        }
    }
    public void printDetails(){
        System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n", name, birthYear, weight,gender);
    }
    public void gainWeight(){
       weight = weight + 1;
    }
    public void gainWeight(double amount){
        if(amount < 0){
            return;
        }
        else{
            weight = weight + amount;
        }
    }
    public void setWeight(double amount){
        if(amount < 0){
            this.weight = -1;

        }
        else{
            this.weight = amount;
        }

    }
    public void loseWeight(){
        if(weight - 1 < 0){
            weight = 0;
        }
        else{
            weight = weight - 1;
        }
    }
    public void loseWeight(double amount){
        if(amount < 0){
            return;
        }
        else{
            if(weight - amount < 0){
                weight = 0;
            }
            else{
                weight = weight - amount;
            }
        }
    }
}

