package com.lms.client;

import java.util.Scanner;

import com.lms.details.LibraryBookDetails;

public class LibraryClient {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        LibraryBookDetails lba=new LibraryBookDetails();
        while(true) {
            System.out.println("----------------------------");
            System.out.println("----------1)LibraryBook----------.");
            System.out.println("----------2)Exit----------");
            System.out.println("enter the choice");
            int choice=sc.nextInt();
            switch(choice) {
            case 1:lba. BookDetails();
            case 2:System.exit(0);
            break;
            default:
                System.out.println("choose between 1 to 2");

 

    }

 

}
 }
}
