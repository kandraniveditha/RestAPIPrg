import java.util.Scanner;
public class ArrayTwodimex {

	public static void main(String[] args) {
		// TODO Auto-generated 
		int arr[][]=new int[4][4];
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.println("Enter The Number:");
				arr[i][j]=sc.nextInt();
				
			}
			System.out.println();
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				sum+=arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			System.out.println();
		}
		
	}

}
