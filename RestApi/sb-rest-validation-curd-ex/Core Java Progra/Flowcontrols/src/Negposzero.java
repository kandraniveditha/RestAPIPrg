//Write a program to check if a given number is Positive, Negative, or Zero.If Statement
public class Negposzero {
	static void checkNumber(int num) {
	if(num>0) 
		System.out.println(num+" :is Positive Number");
	
	else if(num<0)
	System.out.println(num+" :is Negative Number");
	
	else
		System.out.println(num+" :is Zero");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no1=20;
int no2=10;
int no3=-100;
int no4=4*-1;

checkNumber(no1);
checkNumber(no2);
checkNumber(no3);
checkNumber(no4);
	}

}
