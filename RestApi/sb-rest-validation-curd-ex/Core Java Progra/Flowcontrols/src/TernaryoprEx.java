import java.util.Scanner;

public class TernaryoprEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 2, n2 = 9, n3 = -11;

	    // nested ternary operator
	    // to find the largest number
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Marks");
        int marks=sc.nextInt();
	    String result=(marks>=90)?"Grade A":"Grade B";
	    System.out.println("result");
	}

}
