
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//try is associated with catch block
//declare the variables inside the try its act as local variable
//try can have more than one catch block	
//catch block can have more than one exception
		int x=0;
		try
{
		 x=10/0;
System.out.println(x);
}
catch(ArithmeticException e) {
	//System.out.println(e.getMessage());
	//System.out.println(e));
	e.printStackTrace();
}
	//	catch(NullPointerException e) {
			
		//}
	
	finally
	{
		//close the connection
		//database closing connection
		//file close connection
		System.out.println("Finally Block");
	}
System.out.println("hello madam");
	}

}
