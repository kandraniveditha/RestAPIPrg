import java.util.Scanner;

public class Array9Major {
	public static boolean isMajor(int gender,int age) {
		boolean major=false;
		if(gender==1) {
			if(age>=21){
				
			System.out.println("Your Major");
			major =true;
			}
		}
		else
		{
			System.out.println("Your Major");
			
		}
		
			
			if(age>=18) {
			System.out.println("Your Minor");
			major= true;
			}
		else {
			System.out.println("Your Minor");
		}	
		
		
	return major;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		int gender;
		System.out.println("Enter your gender");
		gender=sc.nextInt();
		System.out.println("Enter Your age ");
		age=sc.nextInt();
		System.out.println(isMajor(gender,age));
	}
}
