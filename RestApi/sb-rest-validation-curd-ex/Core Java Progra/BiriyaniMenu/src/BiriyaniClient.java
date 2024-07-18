import java.util.Scanner;

public class BiriyaniClient {
	
	int Biriyani_items=4;
	int chickenbri=200;
	int muttonbri=300;
	int fishbri=320;
	static int total_biriyanis;
	
	int Drink_items=2;
	int cooldrink=20;
	int hotdrink=10;
	static int total_drinks;
	
	int Icecream_items=3;
	int buttersco=45;
	int blueberry=55;
	int chocolate=80;
	static int total_icecreams;
	
	int total_bill;
	
	void Biriyani_items() {
		
		System.out.println("--------------------");
		System.out.println( "1. Chicken briyani");
		System.out.println( "2. Mutton briyani");
		System.out.println( "3. Fish briyani");
		System.out.println("--------------------");
		System.out.println("which type of Biriyani do you want");
		Scanner sc=new Scanner(System.in);
		int plates=sc.nextInt();
		total_biriyanis=Biriyani_items*plates;
		total_biriyanis=chickenbri*plates;
		total_biriyanis=muttonbri*plates;
		total_biriyanis=fishbri*plates;
		total_bill+=total_biriyanis;
		total_bill+=chickenbri;
		total_bill+=muttonbri;
		total_bill+=fishbri;
		System.out.println(plates+" total_bill:"+total_biriyanis);
		}
	void Drink_items() {
		
		System.out.println("--------------------");
		System.out.println("1. Cool Drinks");
		System.out.println("1.1.Sprit");
		System.out.println("1.2.cocok");
		System.out.println("2. Hot Drinks");
		System.out.println("--------------------");
		System.out.println("Which type drinks do you want");
		Scanner sc=new Scanner(System.in);
		int bottel=sc.nextInt();
		total_drinks=Drink_items*bottel;
		total_drinks=cooldrink*bottel;
		total_drinks=hotdrink*bottel;
		total_bill+=total_drinks;
		total_bill+=cooldrink;
		total_bill+=hotdrink;
		System.out.println(bottel+"total_bill:"+total_drinks);
		}
	void Icecream_items() {
		System.out.println("--------------------");
		System.out.println("1. Buttor Scotch");
		System.out.println("2. Blue Berry");
		System.out.println("3. Chocolate");
		System.out.println("--------------------");
		System.out.println("which flavor do you want");
		Scanner sc=new Scanner(System.in);
		int flavor=sc.nextInt();
		total_icecreams=Icecream_items*buttersco*flavor;
		total_icecreams=Icecream_items*blueberry*flavor;
		total_icecreams=Icecream_items*chocolate*flavor;
		total_bill+=total_icecreams;
		total_bill+=buttersco;
		total_bill+=blueberry;
		total_bill+=chocolate;
		System.out.println(flavor+"total_bill:"+total_icecreams);
	}
	void total_bill() {
		System.out.println("total bill payment"+total_bill);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BiriyaniClient bi=new BiriyaniClient();
		while(true)
        {
System.out.println("--------------------------------");
System.out.println("          1)Biriyani                 ");
System.out.println("          2)Drinks                ");
System.out.println("          3)Icrecream                ");
System.out.println("          4)Total_Bill               ");
System.out.println("          5)Exit               ");

System.out.println("--------------------------------");

System.out.println("Enter Choice");
int choice=sc.nextInt();

switch(choice)
{
       case 1:
              bi.Biriyani_items();
              break;
       case 2:
	          bi.Drink_items();
              break;
       case 3:
              bi.Icecream_items();
              break;
       case 4:
	          bi.total_bill();
	          break;
       case 5:
              System.out.println("Thx for Coming!");
              System.exit(0);
       default:
              System.out.println("Choose 1 t0 5 Your Fav BF Between");
}
     }


	}

}
