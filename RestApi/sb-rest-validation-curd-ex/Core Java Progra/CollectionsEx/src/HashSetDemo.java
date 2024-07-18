import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer>marks=new HashSet<Integer>();
marks.add(250);
marks.add(125);
marks.add(145);
marks.add(251);

System.out.println(marks);
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks:");
int m=sc.nextInt();
int k=0;
for(Integer i:marks) {
	if(i==m) {
		k++;
		System.out.println("yes its avilable");
	}
}	
		if(k==0)
		System.out.println("yes its not avilable");	
	
}
	}


