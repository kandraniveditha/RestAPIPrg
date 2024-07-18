package com.cms.details;

import java.util.Scanner;

import com.cms.cimp.CustomerDAOImp;
import com.pms.details.AdminDetails;
import com.pms.pimp.ProductDAOImp;

public class CustomerDetails {
Scanner sc=new Scanner(System.in);
ProductDAOImp pimp1=new ProductDAOImp();
CustomerDAOImp cimp1=new CustomerDAOImp();
AdminDetails ade=new AdminDetails();
public void customDetails() {
	while(true) {
		System.out.println("********************************************************");
		System.out.println("^^^^^^^^^^^^^^^^^^^1.ViewAllProducts^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^^^^^^^^^^^^^^^^^^^2.ViewProduct^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^^^^^^^^^^^^^^^^^^^3.BuyProduct^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^^^^^^^^^^^^^^^^^^^4.Back^^^^^^^^^^^^^^^^^^^^^^");
		
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:pimp1.viewAllProduct();
		break;
		case 2: System.out.println("Enter email:");
		String email=sc.next();
		System.out.println("Enter Password:");
		String pass=sc.next();
		boolean value=pimp1.verifyUnAndPw(email, pass);
		if(value==true) {
			System.out.println("Enter Product Id:");
			int pid=sc.nextInt();
			pimp1.viewProduct(pid);
		}
		else {
			System.out.println("Username and Password Inavlid");
		}
		break;
		case 3: System.out.println("Enter email");
		String email1=sc.next();
		System.out.println("Enter Password:");
		String pass1=sc.next();
		boolean value1=pimp1.verifyUnAndPw(email1, pass1);
		if(value1==true) {
			
		}
		else {
			System.out.println("Username and password Invalid");
		}
		cimp1.buyProduct();
		break;
		case 4:ade.menuDetails();
		break;
		default: 
			System.out.println("Choose 1 to 4");
		}
	}
}
}
