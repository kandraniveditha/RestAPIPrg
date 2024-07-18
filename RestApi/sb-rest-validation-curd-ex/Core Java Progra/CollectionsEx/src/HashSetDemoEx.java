import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pro=new Product(1,"TV",25,36000);
		Product pro1=new Product(2,"AC",5,36000);
		Product pro2=new Product(3,"Cooler",25,36000);
		Product pro3=new Product(4,"Fan",50,36000);
		Product pro4=new Product(5,"Mobile",52,36000);
		
		
		
HashSet<Product>addProduct=new HashSet<>();
addProduct.add(pro);
addProduct.add(pro1);
addProduct.add(pro2);
addProduct.add(pro3);
addProduct.add(pro4);
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Product id");
int pid=sc.nextInt();
int k=0;
for(Product p:addProduct) {
	if(p.getPid()==pid) {
		++k;
		System.out.println(p.getPid()+"\t"+p.getPname()+"\t"+p.getQty()+"\t"+p.getPrice());
	}
}
if(k==0)
	System.out.println("Given ID is NOt Exists");
	}

}
