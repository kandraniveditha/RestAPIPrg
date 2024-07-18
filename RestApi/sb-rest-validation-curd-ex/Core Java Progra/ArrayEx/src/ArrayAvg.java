//1.Write a Java program to calculate the average value of array
public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num=new int[] {10,20,30,40,-11,-16};
int sum=0;
for(int i=0;i<num.length;i++) {
	sum=sum+num[i];
	double avg=sum/num.length; //avg value cal
	System.out.println("Average value of the array elements is: "+avg);
}

	}

}
