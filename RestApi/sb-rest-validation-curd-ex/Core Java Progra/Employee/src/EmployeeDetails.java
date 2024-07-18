import java.util.Scanner;
public class EmployeeDetails {

	Scanner sc=new Scanner(System.in);
	EmployeeImp employee=new EmployeeImp();
	
	public void empoDetails() {
		while(true) {
			System.out.println("------------------------------------------------------");
			System.out.println("                  1)AddEmployee                        ");
			System.out.println("                  2)ViewAllEmployee                       ");
			System.out.println("                  3)viewEmployee                       ");
			System.out.println("                  4)DeleteEmployee                        ");
			System.out.println("                  5)Back                        ");
			System.out.println("------------------------------------------------------");
			System.out.println("Enter The Choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				employee.addEmployees();
				empoDetails();
				break;
			case 2:
				Employee[] viewAllEmployees=employee.viewAllEmployees();
				if(viewAllEmployees!=null) {
					for(Employee em:viewAllEmployees) {
						if(em!=null)
							System.out.println(em.getEmpid() +"\t"+ em.getEmpfstname() +"\t" + em.getEmplastname() +"\t"+ em.getEmpemail() +"\t"+ em.getPhno());
					}
				}else
							System.out.println("Given Record Not Found");
						empoDetails();
						break;
			case 3:
				System.out.println("Enter Employee Id:");
				Employee em=employee.viewEmployee(sc.nextInt());
				if(em!=null)
					System.out.println(em.getEmpid() +"\t"+ em.getEmpfstname() +"\t" + em.getEmplastname() +"\t"+ em.getEmpemail() +"\t"+ em.getPhno());	
				else
					System.out.println("Given Record Not Founded");
				empoDetails();
				break;
			case 4:
				System.out.println("Enter Employees Id:");
				employee.deleteEmployee(sc.nextInt());
				empoDetails();
				break;
			case 5:
				EmployeeClient.main(null);
				default:
					System.out.println("Choose Your Fav 1 to 5 b/w");
				}
			}

		}

	
	
}
