import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product>productList=new ArrayList<Product>();
		productList.add(new Product(1,"Hplap",10,25000));
		productList.add(new Product(2,"Lenovlap",11,27000));
		productList.add(new Product(3,"Delllap",12,23000));
		productList.add(new Product(4,"sonyap",9,35000));
		productList.add(new Product(5,"applelap",14,45000));
		
		
		//30000 above products information hv to display
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price");
		int priceTag=sc.nextInt();
	List<Product>products=	productList.stream().filter(p->p.getPrice()>priceTag).collect(Collectors.toList());
		products.forEach(p->System.out.println(p.getPid()+"\t"+ p.getPname()+"\t"+p.getQty()+"\t"+p.getPrice()));

		//30000 above products price to return
		List<String>productprice=productList.stream().filter(p->p).map(p->p.getPrice()).collect(Collectors.toList());
productprice.forEach(System.out::println);

//convert list to array
Object[]array=productprice.toArray();
for(Object obj :objArray) {
	Integer pro=(Integer)obj;
	System.out.println(pro);
}

List<object>prices=Array.aslist(objArray);

	}

}
