import java.util.Scanner;
public class ProductImp {

	Scanner sc=new Scanner(System.in);
	Product[] addProduct=null;
	
	public void addProduct() {
		System.out.println("How Many Products Do You want:");
		int size=sc.nextInt();
		addProduct=new Product[size];
		
		for (int i = 0; i < addProduct.length; ++i) {
			System.out.println("Enter Product Id:");
			int prodid=sc.nextInt();
			System.out.println("Enetr Product Name:");
			String prodname=sc.next();
			System.out.println("Enter Product Quantity:");
			String prodqty=sc.next();
			System.out.println("Enter Product Price:");
			int prodprice=sc.nextInt();
			Product pd=new Product(prodid,prodname,prodqty,prodprice);
			addProduct[i]=pd;
			System.out.println("Product Addedd Successfully");
		}
		
		}
	public Product[] viewAllProduct() {

		return addProduct;
	}

	public Product viewProduct(int prodid) {
		int k = 0;
		for (Product pd : addProduct) {
			if (pd.getProdid() == prodid) {
				++k;
				return pd;
			}
		}
		
		return null;
	}
	
	public void deleteProduct(int prodid) {
		
		int k = 0;
		int j = 0;
		for (Product pd : addProduct) {
			if (pd.getProdid() == prodid) {

				addProduct[j] = null;
				System.out.println("Given Record is Deleted Successfully");
				++j;
				++k;
				break;
			} else {
				++j;
			}

		}
		if (k == 0)
			System.out.println("Given Record Not Exist");
	}
	

}
