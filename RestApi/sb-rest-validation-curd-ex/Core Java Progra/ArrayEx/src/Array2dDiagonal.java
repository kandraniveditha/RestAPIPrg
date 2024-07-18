
public class Array2dDiagonal {
	static void sum(int[][]mat,int n)
			{
		int fd=0,sd=0;
		for(int i=0;i<n;i++) {
			
				
				fd+=mat[i][i];
					sd+=mat[i][n-i-1];
				}
		System.out.println("First Diagnoal:"+fd);
		System.out.println("First Diagnoal:"+sd);
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][]a= {{1,2,3,4},
		{5,6,7,8},
		{1,2,3,4},
		{5,6,7,8}};
		
sum(a,4);
}
	}

