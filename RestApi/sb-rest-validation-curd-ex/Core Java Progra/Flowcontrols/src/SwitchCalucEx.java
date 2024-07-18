import java.util.Scanner;
public class SwitchCalucEx {

	int fno=100;
	int sno=200;
	int result;
	    void add()
	    {
	        result=fno+sno;
	        System.out.println("Addtion of Two Numbers : "+result);
	    }
	    void sub()
	    {
	        result=sno-fno;
	        System.out.println("Subtraction of Two Numbers : "+result);
	    }
	    void mul()
	    {
	        result=sno*fno;
	        System.out.println("Multiplication of Two Numbers : "+result);
	    }
	    
	    
	    
	    
	    
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner sc=new Scanner(System.in);
	        SwitchCalucEx daoImpl=new SwitchCalucEx();
	        while(true)
	        {
	System.out.println("--------------------------------");
	System.out.println("          1)ADD                 ");
	System.out.println("          2)SUB                 ");
	System.out.println("          3)MUL                 ");
	System.out.println("          4)EXIT                ");



	System.out.println("--------------------------------");
	System.out.println("Enter Choice");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
	    daoImpl.add();
	    break;
	case 2:
	    daoImpl.sub();
	    break;
	case 3:
	    daoImpl.mul();
	    break;
	case 4:
	    System.out.println("Thx for using App!");
	    System.exit(0);
	default:
	    System.out.println("Choose 1 to 4 Between");




	}




	        }
		

	}

}
