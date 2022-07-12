import java.util.Scanner;
public class App {

	EmployeeService service = new EmployeeService();
	static int entry = 0;
	public static void menu() {
        System.out.println("\n");
        System.out.println("+================================+");
        System.out.println("| [1] - Add new Employee Record  |");
        System.out.println("| [2] - Modify Employee Record   |");
        System.out.println("| [3] - Delete Employee Record   |");
        System.out.println("| [4] - View all Employee Record |");
        System.out.println("| [5] - Exit                     |");
        System.out.println("+================================+");
    }
	 
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		EmployeeService service = new EmployeeService();
		
		do {
			menu();
			System.out.print("Input:");
			int choice=input.nextInt();
			switch(choice) {
			
			case 1:
                System.out.println("        +============+         ");
                System.out.println("========|ADD EMPLOYEE|=========");
                System.out.println("        +============+         ");
				service.addEmp();
				break;
                case 2:
                System.out.println("        +===============+         ");
                System.out.println("========|MODIFY EMPLOYEE|=========");
                System.out.println("        +===============+         ");
                service.updateEmployee();
                break;
                case 3:
                System.out.println("        +===============+         ");
                System.out.println("========|DELETE EMPLOYEE|=========");
                System.out.println("        +===============+         ");
				service.deleteEmp();
				break;
			case 4:
                System.out.println("        +================+         ");
                System.out.println("========|EMPLOYEE RECORDS|=========");
                System.out.println("        +================+         ");
				service.viewAllEmps();
				break;
			case 5:
            System.out.println("\n");
            System.out.println(" ¯\\_( U w U )_/¯ ");
            System.out.println("+============================================+");
            System.out.println("| Thank you for using the program            |");
            System.out.println("| Programmed by: Kaihzan - Nixxo C. Jamilla  |");
            System.out.println("+============================================+");
            System.out.println("\n\n");
            entry = 5;
            break;
				
			default:
				System.out.println("Please enter valid input");
				break;
			}
		}while(entry != 5);
		
    }
    
}
