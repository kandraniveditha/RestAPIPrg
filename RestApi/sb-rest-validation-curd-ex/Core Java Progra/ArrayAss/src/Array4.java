
public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,-3,-6,-6};
int max=maxArray(arr,4);
System.out.println("The Largest number is"+max);

	}
static int maxArray(int arr[],int size) {
	int maxV=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>maxV) {
			maxV=arr[i];
		}
	}
	return maxV;
}
}
