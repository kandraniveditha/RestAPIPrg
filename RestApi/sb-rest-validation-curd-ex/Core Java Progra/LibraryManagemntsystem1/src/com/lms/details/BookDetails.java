package com.lms.details;

import java.util.List;
import java.util.Scanner;

import com.lms.Client.BookClient;
import com.lms.imp.BookdaoImp;
import com.lms.pojo.Book;

public class BookDetails {
	 Scanner sc = new Scanner(System.in);
	    BookdaoImp blimp = new BookdaoImp();

	    public void BookDetails()
	    {
	        while (true) {
	            System.out.println("---------------------------------------------.");
	            System.out.println("                    1)Addbookes                ");
	            System.out.println("                    2)Viewallbookes            ");
	            System.out.println("                    3)Viewbookes               ");
	            System.out.println("                    4)Updatebookes             ");
	            System.out.println("                     5)IssuseBooks             ");
	            System.out.println("                    6)Back                   ");
	            System.out.println("enter the choice");
	            int choice = sc.nextInt();
	            switch (choice) {
	            case 1:
	                blimp.addbookes();
	                break;
	            case 2:
	                List<Book> b = blimp.viewallBook();
	                if (b != null) {
	                    System.out.println("bookList");
	                    for (Book b1 : b) {
	                        if (b1 != null)
	                            System.out.println(b1.getBid() + "\t" + b1.getBname() + "\t" + b1.getBqyt());
	                    }
	                }

	 

	                else
	                    System.out.println("record doesnot exist");

	 

	                break;
	            case 3:
	                Scanner sc1 = new Scanner(System.in);
	                System.out.println("enter book id");
	                int bid = sc1.nextInt();
	                Book b2 = blimp.viewBook(bid);
	                if (b2 != null) {

	 

	                    System.out.println(b2.getBid() + "\t" + b2.getBname() + "\t" + b2.getBqyt());
	                } else
	                    System.out.println("record doesnot exists");
	                break;
	            case 4:
	                Scanner sc2 = new Scanner(System.in);
	                System.out.println("update book id");
	                int bid1 = sc2.nextInt();
	                blimp.updatebook(bid1);
	                break;
	            case 5:
	            	Scanner sc3=new Scanner(System.in);
	            	System.out.println("Issuse Book Id:");
	            int bid2=sc3.nextInt();
	            blimp.issuebook(bid2);
	            break;
	            case 6:BookClient.main(null);
	            break;
	            default: System.out.println("Choose between 1 to 5");
	 

	            }
	        }
	    }
	
}
