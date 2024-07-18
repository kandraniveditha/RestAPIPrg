package com.unaryOperators;

public class Postpreincr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=x++;//post increment
		System.out.println(x);//11
		System.out.println(y);//10
		 
		int k=++y;//pre increment
		System.out.println(y);//11
		System.out.println(k);//11
	}

}
