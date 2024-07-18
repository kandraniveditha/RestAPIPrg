package com.pms.details;

import java.util.List;
import java.util.Scanner;

import com.cms.cimp.CustomerDAOImp;
import com.cms.pojo.Customer;
import com.pcms.Client.ClientProduct;
import com.pms.pimp.ProductDAOImp;
import com.pms.pojo.Product;

public class AdminDetails {
	
	ProductDAOImp pimp1=new ProductDAOImp();
CustomerDAOImp cimp1=new CustomerDAOImp();
	Scanner sc=new Scanner(System.in);
	public void menuDetails() {
		while(true) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("^^^^^^^^^^^^^^^^^1.Product^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^^1.Customer^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^^1.Exists^^^^^^^^^^^^^^^^^");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("Enter your Choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: productMenu();
			break;
			case 2:customerMenu();
			break;
			case 3:ClientProduct.main(null);
			default:
				System.out.println("Choose between 1 to 2");
			}
		}
	}
	public void productMenu() {
		while(true) {
			System.out.println("********************************************************");
			System.out.println("^^^^^^^^^^^^^^^^^^^1.AddProduct^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^^^^2.ViewAllProduct^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^^^^3.ViewProduct^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^^^^4.UpdateProduct^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^^^^5.DeleteProduct^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^^^^6.Back^^^^^^^^^^^^^^^^^^^^^^");
			
			System.out.println("Enter your Choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: pimp1.addProduct();
			break;
			case 2: List<Product>p=pimp1.viewAllProduct();
			if(p!=null) {
				System.out.println("Product List");
				for(Product p1:p) {
					if(p1!=null) {
						System.out.println(p1.getpid()+"\t"+ p1.getpname()+"\t"+p1.getpqty()+"\t"+p1.getpprice());
					}
				}
			}
			else {
				System.out.println("Record Doesn't Exists");	
			}
			break;
			case 3:System.out.println("Enter Product id:");
			Product pr=pimp1.viewProduct(sc.nextInt());
			if(pr!=null) {
				System.out.println(pr.getpid()+"\t"+pr.getpname()+"\t"+pr.getpqty()+"\t"+pr.getpprice());
			}
			
			else
			{
				System.out.println("Recorded doesnt exists");
			}
			break;
			case 4:System.out.println("Enter Product id:");
			pimp1.updateProduct(sc.nextInt());
			break;
			case 5:System.out.println("Enter product id:");
			pimp1.deleteProduct(sc.nextInt());
			break;
			case 6:menuDetails();
			break;
			default:
				System.out.println("Enter choice between 1 to 6");
		}
	}
}
	public void customerMenu() {
		while(true) {
			System.out.println("********************************************************");
			System.out.println("^^^^^^^^^^^^^^^^^^^1.AddCustomer^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^^^^2.ViewAllCustomer^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^^^^3.ViewCustomer^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^^^^4.DeleteCustomer^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^^^^5.Back^^^^^^^^^^^^^^^^^^^^^^");
			
			System.out.println("Enter your Choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:cimp1.addCustomer();
			break;
			case 2:List<Customer>cus=cimp1.viewAllCustomer();
			if(cus!=null) {
				for(Customer c:cus) {
					if(c!=null) {
						System.out.println(c.getcid()+"\t"+c.getfname()+"\t"+c.getlname()+"\t"+c.getemailpass()+"\t"+c.getmbphone());
					}
				}
			}
			else {
				System.out.println("Customer Doesn't Exits");
			}
			break;
			case 3: System.out.println("Enter Customer id:");
			Customer cusm=cimp1.viewCustomer(sc.nextInt());
			if(cusm!=null) {
				System.out.println(cusm.getcid()+"\t"+cusm.getfname()+"\t"+cusm.getlname()+"\t"+cusm.getemailpass()+"\t"+cusm.getmbphone());
			}
			else
			{
				System.out.println("Customer Doesn,t Exists");
			}
			break;
			case 4:System.out.println("Enter Customer id:");
			cimp1.deleteCustomer(sc.nextInt());
			case 5:
				menuDetails();
			break;
			default:System.out.println("Choose ur Fav 1 To 5");
			}
		}
	}
}