//27.Swap three array with temp variable
public class ArraySwapTempno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = {10,20,30,40};
	        System.out.println("Array before Swap" + "\n");
	        for (int element : arr) {
	            System.out.println(element);
	        }
	        arr[1]=arr[1]+arr[2];
	        arr[2]=arr[1]-arr[2];
	     arr[1]=arr[1]-arr[2];
	        System.out.println("\n" + "Array after Swap" + "\n");
	        for (int element : arr) {
	            System.out.println(element);
	        }

	}

}
