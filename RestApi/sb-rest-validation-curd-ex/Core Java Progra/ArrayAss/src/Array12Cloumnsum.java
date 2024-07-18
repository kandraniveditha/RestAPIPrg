
public class Array12Cloumnsum {

	static int m=3;
	static int n=3;
	static void column_sum(int arr[][]) {
		int sum=0;
		System.out.println("Finding sum of each column:\n\n");
		for(int i=0;i<m;++i) {
			for(int j=0;j<n;++j) {
			sum=sum+arr[i][j];
			}
			System.out.println("Sum of the Column:"+ i + "=" +sum);
			sum=0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[m][n];
		int x=1;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=x++;
				column_sum(arr);
			}
			
		}
	}

}
