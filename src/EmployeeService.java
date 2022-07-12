import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
	
	HashSet<Employee> empset = new HashSet<Employee>();
	
	Scanner input=new Scanner(System.in);
	boolean found = false;
	String findName = "";
	String firstName;
    String lastName;
	String department;
    double payRate;

	//view all employees
	public void viewAllEmps() {
        int empcount = 1;
		for(Employee emp:empset) {
            System.out.println("           Employee #" + empcount);
			System.out.println(emp);
            empcount++;
		}
	}
	//update the employee
	public void updateEmployee() {
        System.out.print("Enter First Name: ");
		findName=input.next();
		boolean found=false;
		for(Employee emp:empset) {
            String compareString = emp.getFirstName();
            if(compareString.equals(findName)) {
                System.out.print("Enter New First Name: ");
				firstName=input.next();
                
				System.out.print("Enter New Last Name: ");
				lastName=input.next();

                System.out.println("+================+");
                System.out.println("| A - Management |");
                System.out.println("| B - Finance    |");
                System.out.println("| C - Marketing  |");
                System.out.println("+================+");
                System.out.println("");
				System.out.print("Enter New department: ");
				department=input.next();
                if(department.equals("A")){
                    department = "Management";
                }
                else if(department.equals("B")){
                    department = "Finance";
                }
                else if(department.equals("C")){
                    department = "Marketing";
                }
                else {
                    department = "Invalid Departmment";
                }
                
				System.out.println("Enter New Hours Worked");
				payRate=input.nextDouble();
                if (department.equals("Management") && payRate >= 40){
                    payRate = payRate * 200 * 2;
                }
                else if (department.equals("Management")){
                    payRate = payRate * 200;
                }
                else if (department.equals("Finance") && payRate >= 40){
                    payRate = payRate * 180 * 2;
                }
                else if (department.equals("Finance")){
                    payRate = payRate * 180;
                }
                else if (department.equals("Marketing") && payRate >= 40){
                    payRate = payRate * 150 * 2;
                }
                else if (department.equals("Marketing")){
                    payRate = payRate * 150;
                }
                else {
                    payRate = 0;
                }

                emp.setFirstName(firstName);
                emp.setLastName(lastName);
                emp.setDepartment(department);
                emp.setpayRate(payRate);

				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Employee details updated successfully!!");
		}
	}
	//delete emp
	public void deleteEmp() {
		System.out.print("Enter FirstName: ");
		findName=input.next();
		System.out.print("");

		boolean found=false;
		Employee empdelete = null;
		for(Employee emp:empset) {
            String compareString = emp.getFirstName();
			if(compareString.equals(findName)) {
				empdelete = emp;
				found=true;
			}
		}

		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee Deleted Successfully!");
		}
	}
	//add emp
	public void addEmp() {
		System.out.println("==================================");
        System.out.print("Enter First Name: ");
        firstName = input.next();
        
        System.out.print("Enter Last Name: ");
        lastName = input.next();
        System.out.println("");
        
        System.out.println("+================+");
        System.out.println("| A - Management |");
        System.out.println("| B - Finance    |");
        System.out.println("| C - Marketing  |");
        System.out.println("+================+");
        System.out.println("");
        
        System.out.print("Enter Department: ");
        department = input.next();
        if(department.equals("A")){
            department = "Management";
        }
        else if(department.equals("B")){
            department = "Finance";
        }
        else if(department.equals("C")){
            department = "Marketing";
        }
        else {
            department = "Invalid Departmment";
        }
        
        System.out.print("Enter hours worked: ");
        payRate = input.nextInt();
        if (department.equals("Management") && payRate >= 40){
            payRate = payRate * 200 * 2;
        }
        else if (department.equals("Management")){
            payRate = payRate * 200;
        }
        else if (department.equals("Finance") && payRate >= 40){
            payRate = payRate * 180 * 2;
        }
        else if (department.equals("Finance")){
            payRate = payRate * 180;
        }
        else if (department.equals("Marketing") && payRate >= 40){
            payRate = payRate * 150 * 2;
        }
        else if (department.equals("Marketing")){
            payRate = payRate * 150;
        }
        else {
            payRate = 0;
        }

        System.out.println("==================================");
        System.out.println("");
		
		Employee emp = new Employee();
        emp.setFirstName(firstName);
        emp.setLastName(lastName);
        emp.setDepartment(department);
        emp.setpayRate(payRate);
		
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employee added successsfully");
		
	}
	
}