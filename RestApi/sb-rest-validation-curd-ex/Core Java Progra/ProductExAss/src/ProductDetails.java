import java.util.Scanner;
public class ProductDetails {

	Scanner sc=new Scanner(System.in);
	ProductImp pdr=new ProductImp();
	 
	public void proDetails() {
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("               1.Product ID              ");
			System.out.println("               2.Product Name            ");
			System.out.println("               3.Product Qty             ");
			System.out.println("               4.Product Price           ");
			System.out.println("               5.Back                    ");
			System.out.println("-----------------------------------------");
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				pdr.addProduct();
				proDetails();
				break;
			case 2:
				Product[] viewAllProduct=pdr.viewAllProduct();
				if(viewAllProduct !=null) {
					for(Product pd:viewAllProduct) {
						if(pd!=null)
							System.out.println(pd.getProdid() + "\t" + pd.getProdname() + "\t" + pd.getProdqty() + "\t" + pd.getProduprice());	
					}
				}else {
					System.out.println("Given Record Not Exists");
					proDetails();
					break;
				}
					case 3:
						System.out.println("Enter Product Id");
						Product pd = pdr.viewProduct(sc.nextInt());
						if(pd!=null) 
							System.out.println(pd.getProdid() + "\t" + pd.getProdname() + "\t" + pd.getProdqty() + "\t" + pd.getProduprice());
						else
							System.out.println("Given Record is Not Founded");
						proDetails();
						break;
					case 4:
						System.out.println("Enter Product Id");
						 pdr.deleteProduct(sc.nextInt());
						proDetails();
						break;
					case 5:
						ProductClient.main(null);
						default:
							System.out.println("Choose Your Fav Case 1 to 5");
			}
				
				}
		}
	}


