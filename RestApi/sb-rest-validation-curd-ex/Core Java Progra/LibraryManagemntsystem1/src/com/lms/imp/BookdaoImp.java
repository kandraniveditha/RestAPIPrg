package com.lms.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lms.dao.BookDAO;
import com.lms.pojo.Book;

public class BookdaoImp implements BookDAO {
	 Scanner sc=new Scanner(System.in);
	@Override
	public void addbookes() {
		// TODO Auto-generated method stub
		System.out.println("enter no of bookes");
      int  index = sc.nextInt();
       for (int i = 0; i < index; i++) {
           System.out.println("enter book id");
           int bid = sc.nextInt();
           System.out.println("enter book quality");
           int bqty = sc.nextInt();
           System.out.println("enter book name");
           String bname = sc.next();
           Book b=new Book(bid,bname,bqty);
           book.add(b);
           System.out.println("customer records are added successfully");

       }	
	}

	@Override
	public List<Book> viewallBook() {
		// TODO Auto-generated method stub
		return book;
	}

	@Override
	public Book viewBook(int bid) {
		// TODO Auto-generated method stub
		  int k = 0;
	        for (Book b4 : book) {

	            if (b4.getBid() == bid) {

	                ++k;
	                return b4;
	            }
	        }
	        if (k == 0)
	            System.out.println("record does not exit");
		return null;
	}


	@Override
	public void updatebook(int bid) {
		// TODO Auto-generated method stub
		  for (Book bo : book) {
	            if (bo.getBid() == bid) {
	                System.out.println("what do you want to update 1)bid,2)bquty,3)bname");
	                int choice = sc.nextInt();
	                switch (choice) {
	                case 1:
	                    System.out.println("Enter book bid");
	                    int id = sc.nextInt();
	                    bo.setBid(id);
	                    System.out.println("Book Updated successfully");
	                    break;
	                case 2:
	                    System.out.println("Enter book qty");
	                    int qty = sc.nextInt();
	                    bo.setBqyt(qty);
	                    System.out.println("book qty Updated successfully");
	                    break;
	                case 3:
	                    System.out.println("Enter book bname");
	                    String bname = sc.next();
	                    bo.setBname(bname);
	                    System.out.println("book Updated successfully");
	                    break;
	                default:
	                    System.out.println("Choose between 1 to 3");
	                }
	            }
	        }
	    	
	}

	@Override
	public void issuebook(int bid) {
		// TODO Auto-generated method stub
		 // TODO Auto-generated method stub
        for (Book b5 : book) {
            if(b5.getBid()==bid) {
                if(b5.getBqyt()>0) {
                    b5.setBqyt(b5.getBqyt()-1);

                return ;

            }
            }
            }
	}

	@Override
	public void returnbookes(int bid) {
		// TODO Auto-generated method stub
		
	}


	
}
