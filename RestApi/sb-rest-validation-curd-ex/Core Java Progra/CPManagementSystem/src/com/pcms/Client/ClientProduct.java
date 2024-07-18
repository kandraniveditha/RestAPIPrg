package com.pcms.Client;

import java.util.Scanner;

import com.cms.details.CustomerDetails;
import com.pms.details.AdminDetails;

public class ClientProduct {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
AdminDetails ade=new AdminDetails();
CustomerDetails cud=new CustomerDetails();

 while(true) {
	
	System.out.println("-----------------------------------------");
	System.out.println("----------1.Admin--------------------");
	System.out.println("----------2.Customer--------------------");
	System.out.println("----------3.Exit--------------------");
	System.out.println("-----------------------------------------");
	
	System.out.println("Enter your choice");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:ade.menuDetails();
	break;
	case 2:cud.customDetails();
	break;
	case 3:System.exit(0);
	break;
	default:
		System.out.println("Finally done");
	}
}
}
}
