
public class Array7Fibonth {
	
	public static void main(String[] args) {
		System.out.println(getNthTermOfFibonacciSeries(7));
	}

	public static int getNthTermOfFibonacciSeries(int nthTerm) {
		if (nthTerm < 0 ||nthTerm ==0)
			return -1;
		 int f[] = new int[nthTerm+1];
		    int i;
		    for (i = 2; i <= nthTerm; i++)
		    {

		    	f[0] = 0 ;
			    f[1] = 1 ;
			    
		        f[i] = f[i-1] +f[i-2];
		    }
		    return f[nthTerm-1];
	}


}

