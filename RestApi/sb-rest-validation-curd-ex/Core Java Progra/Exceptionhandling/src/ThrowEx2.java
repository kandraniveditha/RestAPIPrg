class AgeIsNotsuitable extends Exception{
	public AgeIsNotsuitable(String str) {
		
		super(str);
	}
}
public class ThrowEx2
{

	public static void validate(int age)throws ArithmeticException
	{
		if(age<18) {
			System.out.println("he/she is eligible for vote");
		}else {
				
			
			throw new ArithmeticException("He/she Is not eligible for vote");
		}
	}
	public static void main(String[] args) {
		
		try {
			
		
		validate(12);
		}
		catch(ArithmeticException e) {
			
			//System.out.println("Hellomadam");
		//	e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Hello Boss");
	}
}
