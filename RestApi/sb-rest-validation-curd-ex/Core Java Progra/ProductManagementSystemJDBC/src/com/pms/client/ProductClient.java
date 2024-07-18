package com.pms.client;

import java.util.List;
import java.util.Scanner;

import com.pms.dao.ProductDAO;
import com.pms.dao.impl.ProductDAOImpl;
import com.pms.model.Product;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ProductDAO daoImpl=new ProductDAOImpl();
		while(true) {
System.out.println("-------------------------------");
System.out.println("           1.Addproduct        ");
System.out.println("           2.ViewAllproduct        ");
System.out.println("           3.Viewproduct        ");
System.out.println("           4.exit               ");
System.out.println(" --------------------------------");
System.out.println("Enter the choice");
int choice=sc.nextInt();
switch(choice) {
case 1:
	System.out.println("Enter Product Id");
int pid=sc.nextInt();
System.out.println("Enter Product Name");
String pnamel=sc.next();
System.out.println("Enter Product Quantity");
int pqty=sc.nextInt();
System.out.println("Enter Product price");
int pprice=sc.nextInt();
Product product=new Product(pid,pnamel,pqty,pprice);
int count=daoImpl.addProducts(product);
if(count!=0)
	System.out.println("Data Inserted Sucessfully");
else
	System.out.println("Data not Inserted Sucessfully");
break;
case 2: 
	List<Product>viewAllProducts=daoImpl.viewAllProducts();
viewAllProducts.stream().forEach(pro->System.out.println(pro.getPid()+"\t"+pro.getPnamel()+"\t"+pro.getPqty()+"\t"+pro.getPprice()));
break;
case 3:
	System.out.println("Enter Product id");
	Product pro=daoImpl.viewProduct(sc.nextInt());
	if(pro!=null)
		System.out.println(pro.getPid()+"\t"+pro.getPnamel()+"\t"+pro.getPqty()+"\t"+pro.getPprice());
	else
		System.out.println("Given product id not exists");
	break;
case 4:
	System.out.println("Thanks for using app!");
	System.exit(0);
	break;
	default:
		System.out.println("Choose 1 to 4 betwwn");
		
}//end of switch
		}//end while loop
		
		
		
	}

}
