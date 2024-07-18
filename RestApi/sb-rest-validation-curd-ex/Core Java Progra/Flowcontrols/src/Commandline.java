//Write a program to check if the program has received command line arguments or not.
//If the program has not received the values then print "No Values",
//else print all the valuesin a single line separated by ,(comma).
//Eg1) java Example O/P: No values Eg2) javaExample Mumbai Bangalore 
//O/P: Mumbai,Bangalore [Note: You can use lengthproperty of an array to check its lengthIf Statement
public class Commandline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
if(args.length==1)
{
	System.out.println("No Values");
	
}
else {
	for(String i:args)
		System.out.println(i+",");
}
	}

}
