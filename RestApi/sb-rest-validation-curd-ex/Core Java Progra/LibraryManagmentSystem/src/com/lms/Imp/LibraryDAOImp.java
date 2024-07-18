package com.lms.Imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lms.dao.LibraryBookDAO;
import com.lms.pojo.Library;

public class LibraryDAOImp implements LibraryBookDAO{
	Scanner sc=new Scanner(System.in);	
	ArrayList<Library>addLibrary=new ArrayList<Library>();

	@Override
	public void addLibrary() {
		// TODO Auto-generated method stub
	System.out.println("Enter number of Library Books:");
	int index=sc.nextInt();
	for(int i=0;i<index;i++){
	System.out.println("Enter Library id:");
	int laid=sc.nextInt();
	System.out.println("Enter Library Book Name:");
	String laname=sc.next();
	System.out.println("Enter Library Book Quantity:");
	int laqty=sc.nextInt();
	Library lb=new Library(laid,laname,laqty);
	/Library=add(lb);
	System.out.println("Library Books Recorded Sucessfully");
	}	
	}

	@Override
	public ArrayList<com.lms.pojo.Library> viewAllLibrary() {
		// TODO Auto-generated method stub
		
		return Library;
	}

	@Override
	public Library viewLibrary(int lid) {
		// TODO Auto-generated method stub
		int k=0;
		for(Library li:Library)
			if(li.getLid()==lid) {
				++k;
				return li;
			}
		if(k==0)
			System.out.println("Library view Record doesn't Exists");
		return null;
	}

	@Override
	public void updateLibrary(int lid) {
		// TODO Auto-generated method stub
		for(Library la:Library)
			if(la.getLid()==lid)
				System.out.println("Which one you Updated 1.Lid 2.Lname 3.lQty");
				int choice=sc.nextInt();
			
				switch(choice) {
				
				case 1:System.out.println("Enter Library id:");
				int laid=sc.nextInt();
				la.setLid(laid);
				System.out.println("Library ID Updated Sucessfully");
				break;
				
				case 2:	System.out.println("Enter Library Book Name:");
				String laname=sc.next();
			    la.setLname(laname);
			    System.out.println("Library name Updated Sucessfully");

			    break;
			 
				case 3:System.out.println("Enter Library Book Quantity:");
				String laqty=sc.next();
				la.setLid(laqty);
				System.out.println("Library quantity Updated Sucessfully");
				break;
				
				default:System.out.println("Choose b/w 1 to 3");
				break;
				}
	}

	@Override
	public void returnLibrary(int lid) {
		// TODO Auto-generated method stub
		
		return ;
	}

	
	

}
