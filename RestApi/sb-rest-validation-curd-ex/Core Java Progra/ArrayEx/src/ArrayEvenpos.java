//21.Program to print the elements of an array present on evenposition
public class ArrayEvenpos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = new int [] {1, 2, 3, 4, 5};  
		  
	        System.out.println("Elements of given array present on even position: ");  
	        for (int i = 1; i < arr.length; i = i+2) {  
	            System.out.println(arr[i]);  
	        }  
	}

}
