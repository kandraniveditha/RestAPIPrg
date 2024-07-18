package com.lms.Client;

import java.util.Scanner;

import com.lms.details.BookDetails;
import com.sms.details.StudentDetails;

public class BookClient {
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        BookDetails ba=new BookDetails();
	        StudentDetails sd=new StudentDetails();
	        while(true) {
	            System.out.println("-----------------------------");
	            System.out.println("          1)Book              ");
	            System.out.println("           2)Student          ");
	            System.out.println("          3)exit               ");
	            System.out.println("enter the choice");
	            int choice=sc.nextInt();
	            switch(choice) {
	            case 1:ba.BookDetails();
	            break;
	            case 2:sd.stuMenu();
	          break;
	            case 3:System.exit(0);
	            break;
	            default:
	                System.out.println("choose between 1 to 2");

	 

	    }

	 

	}
	 }
}
