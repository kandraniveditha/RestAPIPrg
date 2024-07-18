import java.util.Scanner;

public class BreakfastSwitch {

	int idly=50;
	int idly_bill;
	int dosa=35;
	int dosa_bill;
	int bonda=20;
	int bonda_bill;
	
	int total_bill;
	
	void idly() {
		System.out.println("How many plates do you want");
		Scanner sc=new Scanner(System.in);
		int idlyplates=sc.nextInt();
		idly_bill=idly*idlyplates;
		total_bill+=idly_bill;
		System.out.println(idlyplates+" idly bill:"+idly_bill);
		}
	
	void Dosa() {
		System.out.println("How many Dosas do you want");
		Scanner sc=new Scanner(System.in);
		int dosaplates=sc.nextInt();
		dosa_bill=dosa*dosaplates;
		total_bill+=dosa_bill;
		System.out.println(dosaplates+" dosa bill:"+dosa_bill);
	}
	
	void bonda() {
		System.out.println("Which type of bonda do you want");
		Scanner sc=new Scanner(System.in);
		int bondaplates=sc.nextInt();
		bonda_bill=idly*bondaplates;
		total_bill+=bonda_bill;
		System.out.println(bondaplates+" bonda bill:"+bonda_bill);
	}
	void total_bill() {
		
		System.out.println("Total bill payment"+total_bill);
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BreakfastSwitch bc=new BreakfastSwitch();
		while(true)
        {
System.out.println("--------------------------------");
System.out.println("          1)Idly                 ");
System.out.println("          2)Dosa                ");
System.out.println("          3)Bonda                ");
System.out.println("          4)Total_Bill               ");
System.out.println("          5)Exit               ");

System.out.println("--------------------------------");

System.out.println("Enter Choice");
int choice=sc.nextInt();

switch(choice)
{
       case 1:
              bc.idly();
              break;
       case 2:
	          bc.Dosa();
              break;
       case 3:
              bc.bonda();
              break;
       case 4:
	          bc.total_bill();
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
