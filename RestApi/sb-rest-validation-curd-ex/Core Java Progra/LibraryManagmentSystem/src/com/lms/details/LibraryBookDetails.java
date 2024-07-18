package com.lms.details;

import java.util.List;
import java.util.Scanner;

import com.lms.Imp.LibraryDAOImp;
import com.lms.pojo.Library;

public class LibraryBookDetails {
	Scanner sc = new Scanner(System.in);
    LibraryDAOImp blimp = new LibraryDAOImp();
	
	 public void BookDetails() {
	        while (true) {
	            System.out.println("------------------------------------------------");
	            System.out.println("--------------------1)addbookes------------------");
	            System.out.println("--------------------2)viewallbookes--------------------");
	            System.out.println("--------------------3)viewbookes--------------------");
	            System.out.println("--------------------4)Updatebookes--------------------");
	            System.out.println("--------------------5)ReturnBooks--------------------");
	            System.out.println("---------------------6)Back------------------------");
	            System.out.println("enter the choice");
	            int choice = sc.nextInt();
	            switch (choice) {
	            case 1:
	                blimp.addLibrary();
	                break;
	            case 2:
	                List<Library> b = blimp.viewAllLibrary();
	                if (b != null) {
	                    System.out.println("LibraryList");
	                    for (Library b1 : b) {
	                        if (b1 != null)
	                            System.out.println(b1.getLid() + "\t" + b1.getLname() + "\t" + b1.getLqyt());
	                    }
	                }

	 

	                else
	                    System.out.println("record doesnot exist");

	 

	                break;
	            case 3:
	                Scanner sc1 = new Scanner(System.in);
	                System.out.println("enter book id");
	                int lid = sc1.nextInt();
	                Library b2 = blimp.viewLibrary(lid);
	                if (b2 != null) {

	 

	                    System.out.println(b2.getLid() + "\t" + b2.getLname() + "\t" + b2.getLqyt());
	                } else
	                    System.out.println("record doesnot exists");
	                break;
	            case 4:
	                Scanner sc2 = new Scanner(System.in);
	                System.out.println("update book id");
	                int lid1 = sc2.nextInt();
	                blimp.updateLibrary(lid1);
	                break;
	            
	 default: 
		System.out.println("Choose betweeen 1 to 4");
	 

	            }
	        }
	    }
	
}
