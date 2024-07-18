import java.util.Scanner;

public class Leapyex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year");
		int year=sc.nextInt();
		if((year % 400==0)||(year % 4==0))
		{
			System.out.println(year +
					"The number is Leap Year");
		}
		else
		{
			System.out.println(year +"The number is not Leap Year");
		}
	}

}
