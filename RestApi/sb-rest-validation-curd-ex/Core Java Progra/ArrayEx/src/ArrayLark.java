//14)Write a Java program to find the k largest elements in a given array.
//Elements in the array can be in any order
public class ArrayLark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {10,40,80,100,200,300};
		int k=3;
		System.out.println("Original Array: ");
		for (int i = 0; i < arr.length; i++) {     
		    System.out.print(arr[i] + " ");    
		}
		System.out.println();
		System.out.println(k+" Largest Elements of the array are:");
		for(int i=0; i<k; i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
