public class Person {

    private String name;
    private int birthYear;

    public Person(){
        name = "";
        birthYear = 0;
    }
    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName(){
        return name;
    }
    public int getBirthYear(){
        return birthYear;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals(Object obj){

        if(!(obj instanceof Person)){
            return false;
        }

        if(obj == null) {
            return false;
        }

        if(this == obj){
            return true;
        }

        Person other = (Person) obj;

        if(name.equals(other.name)
                && birthYear == other.birthYear){
            return true;
        }
        else{
            return false;
        }


    }
    @Override
    public String toString(){
            return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
    }
    //@Override
    public int compareTo(Person p){
        return birthYear - p.birthYear;
    }

}
