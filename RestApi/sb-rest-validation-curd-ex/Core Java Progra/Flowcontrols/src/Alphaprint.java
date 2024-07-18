//intialize a character variable in a program and if the value is alphabet then print"Alphabet
//" if it’s a number then print "Digit" and for other characters print
//"SpecialCharacter"If Statement

import java.util.Scanner;
public class Alphaprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Variable");
char char1=sc.next().charAt(0);
if((char1>='a' && char1<='z'))                      {
	System.out.println("char is Alphabet");
}
else if( (char1>= 47 && char1 <= 100))
{
	System.out.println("char is Digit");
}
else 
{
	System.out.println("char is Special Character");
}
	}

}
