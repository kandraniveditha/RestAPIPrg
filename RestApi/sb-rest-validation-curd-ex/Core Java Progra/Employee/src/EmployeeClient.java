import java.util.Scanner;
public class EmployeeClient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	EmployeeDetails det=new EmployeeDetails();
	while(true) {
		System.out.println("-----------------------------");
		System.out.println("          1.Employee         ");
		System.out.println("          2.Exit             ");
		
		System.out.println("Enter Your Choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter User Name");
			String uname=sc.next();
			System.out.println("Enter passWord");
			String pass=sc.next();
			if((uname.equals("Chowdary")) && (pass.equals("Niveditha@123"))) 
	        det.empoDetails();
			else
				System.out.println("Invalid User Name and Password");
			break;
		case 2:
			System.out.println("thank you");
			System.exit(0);
			default:
				System.out.println("Choose 1 to 2 between");

		}
	}
	}
}
