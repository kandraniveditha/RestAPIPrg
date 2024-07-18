//Write a program to print even numbers between 23 and 57, each number should be
//printed in a separate row.
public class Seperateeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count;
for(int i=22;i<=58;i++) {
	count=0;
	for(int j=2;j<i;j++)
	{
		if(i%j==0) {
			count=1;
			break;
		}
	}
	if(count==0)
	
	System.out.println(i);
}
	}

}
