import java.util.Scanner;
public class NestedifEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter The Value");
		int age=sc.nextInt();
		if(age>18)
		{
		    System.out.println("Enter The Weight");
		    int weight=sc.nextInt();    
		    if(weight>45)
		    {
		        System.out.println("He/She Can given the blood");
		    }
		    else
		    {
		        System.out.println("He/She UnderWeight");
		    }
		     
		}
		else
		{
		    System.out.println("He/She Is Minor");
		}
	}

}
