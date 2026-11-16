public class GeneralStaff extends Employee{

    private String duty;

    public GeneralStaff(){
        duty = "";
    }
    public GeneralStaff(String duty){
        this.duty = duty;
    }
    public GeneralStaff(String deptName, String duty){
        super(deptName);
        this.duty = duty;
    }
    public GeneralStaff(String name, int birthYear, String deptName, String duty){
        super(name, birthYear, deptName);
        this.duty = duty;
    }

    public String getDuty(){
        return duty;
    }

    @Override
    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }

        if(!(obj instanceof Employee)){
            return false;
        }

        GeneralStaff other = (GeneralStaff) obj;

        if(super.equals(obj) && duty.equals(other.getDuty())){
            return true;
        }
        else{
            return false;
        }


    }
    @Override
    public String toString(){
        return String.format("Person: Name: %30s | Birth Year: %4d Employee: Department: %20s | Employee Number: %3d", getName(), getBirthYear(), getDeptName(), getEmployeeID());
    }
    //@Override
    public int compareTo(Person p){
        GeneralStaff other = (GeneralStaff) p;
        return compareTo(other);
    }
}
