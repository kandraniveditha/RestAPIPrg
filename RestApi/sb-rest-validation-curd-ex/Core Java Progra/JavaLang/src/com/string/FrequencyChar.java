package com.string;

public class FrequencyChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="aebcd";
/*
int count=0;
for(int i=0;i<str.length();i++) {
	if(str.charAt(i)=='o') {
		count++;
	}
}
System.out.println("Frequency of o is"+count);
*/
for(int i=0;i<str.length();i++) {
	
	if(str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c' || str.charAt(i) == 'd' || str.charAt(i) == 'e') {
		
		System.out.println("Its vowel:"+str.charAt(i));
	}
}
	}

}
