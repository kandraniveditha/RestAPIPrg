//Write a Java program to find the k smallest elements in a given array.
//Elements in the array can be in any order
public class ArrayKvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[] {1,3,4,20,14,25,30,40};
int k=5;
System.out.println("Original Array: ");
for (int i = 0; i < arr.length; i++) {     
    System.out.print(arr[i] + " ");    
}
System.out.println();
System.out.println(k+" Smallest Elements of the array are:");
for(int i=0; i<k; i++)
{
	System.out.println(arr[i]+" ");
}
	}

}
