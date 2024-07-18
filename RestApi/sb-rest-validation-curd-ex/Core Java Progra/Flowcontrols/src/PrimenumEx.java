import java.util.Scanner;

public class PrimenumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int count=0;
		if(num==0||num==1)
		{
			System.out.println("Given number is a prime number");
		}
		else
		{
			for(int i=2;i<num;++i)
			{
				if(num%i==0)
				{
					System.out.println("Given number is not a prime number");
					count++;
					break;
				}
			}
		}
		if(count==0)
			System.out.println("Given number is prime number");
		
	}


	}


