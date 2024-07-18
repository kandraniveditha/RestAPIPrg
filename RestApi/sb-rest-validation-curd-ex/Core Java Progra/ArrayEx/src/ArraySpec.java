//2.Write a Java program to test if an array contains a specific value
public class ArraySpec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {2010,2011,2012,2013,2015};
int num=2013;
for(int i=0; i<arr.length; i++) {
	if(num==arr[i]) {
		System.out.println("Array Contains Specific the Given Elements");
		//else
		//System.out.println("Array Contains not specific the given elements ");
	}
}
	}

	}
