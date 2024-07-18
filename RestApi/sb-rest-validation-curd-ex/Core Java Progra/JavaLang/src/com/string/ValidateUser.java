package com.string;
import java.util.Scanner;
public class ValidateUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter User Name:");
String uname=sc.next();
System.out.println("Enter Password:");
String pass=sc.next();
if(uname.equalsIgnoreCase("Admin")&&pass.equals("Nive@123"))
System.out.println("Valid User");
else
	System.out.println("Invalid User");
	}

}
