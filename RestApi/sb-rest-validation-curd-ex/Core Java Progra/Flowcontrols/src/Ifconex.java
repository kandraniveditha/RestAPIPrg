import java.util.Scanner;

public class Ifconex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
	/*
		if(num%2==0)
		{
			System.out.println("The number is even"+num);
		}
		else
		{
			System.out.println("The number is not even "+num);
		}
*/
		String result=(num%2==0)?"Given Number is even":"Given number is not even number";
		System.out.println(result);
	}

}
