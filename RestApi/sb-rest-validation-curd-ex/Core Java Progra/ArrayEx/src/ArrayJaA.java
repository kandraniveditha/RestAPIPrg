import java.util.Scanner;

public class ArrayJaA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int arr[][]=new int[3][];
 arr[0]=new int[3];
 arr[1]=new int[2];
 arr[2]=new int[1];
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.println("Enter The Number:");
			
			arr[i][j]=sc.nextInt();	
		}
		System.out.println();
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			
			System.out.print(arr[i][j]+" ");
		}
		
		System.out.println();
	}
	}

}
