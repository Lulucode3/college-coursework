public class Farm {
    private Animal[] animals;
    private String farmName;
    private int numAnimals;

    private static final int DEFAULT_SIZE =10;

    public Farm(){
        this.animals = new Animal[DEFAULT_SIZE];
        this.farmName = "Default";
        this.numAnimals = 0;
    }
    public Farm(int size){
        this.animals = new Animal[size];
        this.farmName = "";
        this.numAnimals =0;

    }
    public Farm(String farmName){
        this.animals = new Animal[DEFAULT_SIZE];
        this.farmName = farmName;
        this.numAnimals = 0;
    }
    public Farm(String farmName, int size){
        this.animals = new Animal[size];
        this.farmName = farmName;
        this.numAnimals = 0;
    }
    public void  addAnimal(Animal a){
        if(numAnimals < animals.length){
            animals[numAnimals] = a;
            numAnimals++;
        }

    }
    public String getFarmName(){
        return farmName;
    }
    public void setFarmName(String farmName){
        this.farmName = farmName;
    }
    public Animal getAnimal(int index){
        if(index < 0 || index >= numAnimals){
            return null;
        }
        return animals[index];
    }
    public int getNumAnimals(){
        return numAnimals;
    }
    public Animal getFirstAnimal(){
        if(numAnimals == 0){
            return null;
        }
        return animals[0];
    }
    public Animal getLastAnimal(){
        if(numAnimals == 0){
            return null;
        }
        return animals[numAnimals - 1];
    }
    public Animal[] getAnimals(){
        Animal[] copy1 = new Animal[numAnimals];
        for(int i = 0; i < numAnimals; i++){
            copy1[i] = animals[i];
        }
        return copy1;
    }
    public void printAllDetails(){
        System.out.printf("FarmName: %20s | Number of Animals: %4d | Farm Size: %4d\n",farmName, numAnimals,animals.length);


        for(int i = 0; i < numAnimals; i++){
            animals[i].printDetails();
        }
    }
    public Animal removeAnimal(int index){
        if(index <= -1 || index >= numAnimals){
            return null;
        }
        Animal takeAway = animals[index];
        for(int i = index; i < numAnimals - 1; i++){
            animals[i] = animals[i + 1];
        }
        animals[numAnimals - 1] = null;
        numAnimals = numAnimals - 1;

        return takeAway;
    }
    public void removeAllAnimals(){
        for(int i = 0; i < numAnimals; i++){
            animals[i] = null;
        }
        numAnimals =0;
    }
    public double getTotalWeightOfAllAnimals(){

        double result = 0.0;

        for(int i = 0; i < numAnimals; i++){
            result += animals[i].getWeight();
        }
        return result;
    }
    public double getAverageWeightOfAllAnimals(){
        if(numAnimals == 0){
            return 0.0;
        }
        return getTotalWeightOfAllAnimals()/numAnimals;
    }
    public int getNumberOfAnimalsAboveWeight(double weight){
        int num = 0;

        for(int i = 0; i < numAnimals; i++){
            if(animals[i].getWeight()>weight){
                num++;
            }
        }
        return num;
    }
    public int getNumberOfAnimalsBelowWeight(double weight){
        int num = 0;
        for(int i = 0; i < numAnimals; i++){
            if(animals[i].getWeight()<weight){
                num++;
            }
        }
        return num;
    }
    public void increaseWeightOfAllAnimals(){
        for(int i = 0; i < numAnimals; i++){
            animals[i].gainWeight();
        }

    }
    public void increaseWeightOfAllAnimals(double amount){
        for(int i = 0; i < numAnimals; i++){
            animals[i].gainWeight(amount);
        }

    }
}
