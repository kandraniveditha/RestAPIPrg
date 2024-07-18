//Write a program to check if a given number is odd or even.If Statement
import java.util.Scanner;
public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:\n");
int n=sc.nextInt();
if(n%2==0) {
	System.out.println("The given number" +n+ "is Even");
}
else
{
	System.out.println("The given is" +n+ "is odd");
}
	}

}
