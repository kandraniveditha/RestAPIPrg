package com.string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("NivedithaChowdary".length());

System.out.println("       Welcome to java   ");

System.out.println("          Welcome to java".trim());

System.out.println("Nivedithakandrachowdary".replace('a', 'A'));

System.out.println("welcome to  training to shiva sir".replaceAll("welcome","java"));

System.out.println("welcome to  training to shiva sir".replaceFirst("welcome","java"));
System.out.println("NivedithaChowdary".substring(4));
System.out.println("NivedithaChowdary".substring(4,7));
System.out.println("Niveditha".charAt(4));

String s="Nivedithachowdary";
//string to char
char[] charArray=s.toCharArray();
for(char d : charArray)
	System.out.println(d+" ");
System.out.println();

//Character  Array to String

String str =String.copyValueOf(charArray);
System.out.println(str);

System.out.println(String.valueOf(100));
System.out.println(String.valueOf(charArray));


	}

}
