//Prime are not
public class ArrayPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
	    int i = 0;
	    int flag = 0;

	    int arr[] = {10, 11, 13, 15, 17, 19, 23, 25, 30};

	    for (num = 0; num < arr.length; num++) {
	      flag = 0;
	      for (i = 2; i < arr[num] / 2; i++) {
	        if (arr[num] % i == 0) {
	          flag = 1;
	          break;
	        }
	      }
	      System.out.printf("%3d - %s\n", arr[num], (flag == 0 ? "Prime" : "Not Prime"));
	    }
	    System.out.println();
	}

}
