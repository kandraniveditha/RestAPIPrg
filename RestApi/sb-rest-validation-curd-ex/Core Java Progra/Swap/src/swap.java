
public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=20;
        System.out.println("Before Swapping");
        System.out.println( "value a is :"+a);
        System.out.println( "value b is :"+b);
        
        a=a+b;
        b=a-b;
        a=a-b;
        
        
        System.out.println("After Swapping");
        System.out.println( "value a is :"+a);
        System.out.println( "value b is :"+b);
        
	}

}
