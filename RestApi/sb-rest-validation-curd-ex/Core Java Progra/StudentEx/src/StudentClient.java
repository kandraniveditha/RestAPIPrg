
import java.util.Scanner;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
StudentDetails details=new StudentDetails();
while(true)
{
System.out.println("-----------------------------------------------");
System.out.println("              1)Student                        ");
System.out.println("              2)Exit                        ");
System.out.println("-----------------------------------------------");

System.out.println("Enter The Choice");
int choice=sc.nextInt();
switch(choice)
{
case 1:
	
	System.out.println("Enter User Name ");
	String uname=sc.next();
	System.out.println("Enter PassWord");
	String pass=sc.next();
	if(uname.equals("Nive")&&pass.equals("Nive@123"))
	details.stuDetails();
	else
		System.out.println("Invalid User Name And PassWord");
	break;
case 2:
	System.out.println("Thx for App!");
	System.exit(0);
	default:
		System.out.println("Choose 1 to 2 Between");
}


}


}

}
