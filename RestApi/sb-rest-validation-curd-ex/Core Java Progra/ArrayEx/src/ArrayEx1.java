
public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]=new int[3];
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		//System.out.println(ar[3]);//ArrayIndexOutOfBoundsException
		ar[1]=100;
		ar[2]=300;
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println("***************************************");
		for(int i=0;i<ar.length;++i)
		{
		    System.out.println(ar[i]);
		}
		System.out.println("***************************************");
		for(int j :  ar)
		{
		    System.out.println(j);
		}
	}

}
