//initialize two character variables in a program and display the characters in alphabetical order.
//Eg1) if first character is s and second is e O/P: e,s Eg2) 
//if first character is a and second is e O/P:a,eIf Statement

import java.util.Scanner;
public class Alpaorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a first char:");
char c1=sc.next().charAt(0);

System.out.println("Enter a Second char:");
char c2=sc.next().charAt(0);

if(c1>c2) 
	System.out.println(c2+" ,"+c2);

else 
	System.out.println(c1+","+c2);

	}

}
