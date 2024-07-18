//26.Swap two array with temp variable
public class ArraySwap2num {

	

	public static void main(String[] args) {
		 int [] arr = {10,20,30,40};
	        System.out.println("Array before Swap" + "\n");
	        for (int element : arr) {
	            System.out.println(element);
	        }
	        int temp = arr[1];
	        arr[1] = arr[2];
	        arr[2] = temp;
	        System.out.println("\n" + "Array after Swap" + "\n");
	        for (int element : arr) {
	            System.out.println(element);
	        }
		    
	}

}
