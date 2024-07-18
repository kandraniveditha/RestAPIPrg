
import java.util.Scanner;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
ProductDetails de=new ProductDetails();
while(true)
{
System.out.println("-----------------------------------------------");
System.out.println("              1)Product                        ");
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
	if((uname.equals("Kandra"))&&(pass.equals("Nive@123")))
	de.proDetails();
	else
		System.out.println("Invalid User Name And PassWord");
case 2:
	System.out.println("Thanks you For Visiting");
	System.exit(0);
	default:
		System.out.println("Choose 1 to 2 between");
}
}
	}
}
