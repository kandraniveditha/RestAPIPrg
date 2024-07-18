import java.util.Scanner;
public class EmployeeImp {

	Scanner sc=new Scanner(System.in);
	Employee[] addEmployees=null;
	public void addEmployees() {
		System.out.println("How many Employees Do you Wnat");
		int size=sc.nextInt();
	addEmployees=new Employee[size];
	
	for(int i=0;i<addEmployees.length;i++) {
		System.out.println("Enter Employee ID:");
		int empid=sc.nextInt();
		System.out.println("Enter Employee First Name:");
		String empfstname=sc.next();
		System.out.println("Enter Employee Last Name:");
		String emplastname=sc.next();
		System.out.println("Enter Employee Email:");
		String empemail=sc.next();
		System.out.println("Enter Employee Phone Number:");
		int empphon=sc.nextInt();
		Employee empo=new Employee(empid,empfstname,emplastname,empemail,empphon);
		addEmployees[i]=empo;
		System.out.println("Employee Record Added Successfully");
	}
	}
	public Employee[] viewAllEmployees() {
		return addEmployees;
	}
	public Employee viewEmployee(int empid) {
		int k=0;
		for(Employee em :addEmployees) {
			if(em.getEmpid()==empid) {
				++k;
				return em;
			}
		}
		return null;
	}
public void deleteEmployee(int empid) {
		
		int k = 0;
		int j = 0;
		for (Employee em : addEmployees) {
			
			if (em.getEmpid()==empid) {

				addEmployees[j] = null;
				System.out.println("Given Record is Deleted Successfully");
				++j;
				++k;
				break;
			} else {
				++j;
			}

		}
		if (k == 0)
			System.out.println("Given Record Not Exist");
}
}
