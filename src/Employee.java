public class Employee {
	
	private String firstName;
    private String lastName;
    private String department;
    private double payRate;
    
    
    public Employee(String firstName, String lastName, String department, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.payRate = payRate;
    }
    
    public Employee() {
    }

    //GETTERS
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public double getpayRate() {
        return payRate;
    }


    //SETTERS
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public void setpayRate(double payRate) {
        this.payRate = payRate;
    }
    @Override
    public String toString() {
        return "+================================+\n"+
        "First Name: "+ firstName+"\n"+
        "Last Name: "+ lastName+"\n"+
        "Department: "+ department+"\n"+
        "Weekly Salary: "+ payRate+"\n"+
        "+================================+\n";
    }
	
	

}