//Write a program to convert from upper case to lower case and vice versa of an alphabet and print
//the old character and new character as shown in example (Ex: a->A, M->m).If Statement
import java.util.Scanner;
public class Upperlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char chupper,chlower;
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Upper case value:");

chupper=sc.next().charAt(0);
num=chupper;
num=num+32;
chlower=(char)num;
System.out.println("Enter a lower case value:"+chlower);
	}

}
