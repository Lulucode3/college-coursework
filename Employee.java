public class Employee extends Person{

    private String deptName;
    private static int numEmployees;
    private int employeeID;

    public Employee(){
        deptName = "";
        numEmployees++;
        employeeID = numEmployees;
    }
    public Employee(String deptName){
        this.deptName = deptName;
        numEmployees++;
        employeeID = numEmployees;
    }
    public Employee(String name, int birthYear, String deptName){
        super(name, birthYear);
        this.deptName = deptName;
        numEmployees++;
        employeeID = numEmployees;
    }

    public String getDeptName() {
        return deptName;
    }
    public static int getNumEmployees(){
        return numEmployees;
    }
    public int getEmployeeID() {
        return employeeID;
    }

    public void setDeptName(String deptName){
        this.deptName = deptName;
    }

    @Override
    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }

        if(!(obj instanceof Employee)){
            return false;
        }

        Employee other = (Employee) obj;

        if(super.equals(obj) && getDeptName().equals(other.getDeptName())
            && numEmployees == other.getNumEmployees()
                && employeeID == other.getEmployeeID()){

            return true;
        }
        else{
            return false;
        }


    }
    @Override
    public String toString(){
        return String.format("Person: Name: %30s | Birth Year: %4d Employee: Department: %20s | Employee Number: %3d", getName(), getBirthYear(), deptName, employeeID);
    }
    @Override
    public int compareTo(Person p){
        Employee other = (Employee) p;
        return employeeID - other.getEmployeeID();
    }

}


