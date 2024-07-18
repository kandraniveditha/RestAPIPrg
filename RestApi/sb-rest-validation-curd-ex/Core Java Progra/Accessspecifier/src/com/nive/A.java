package com.nive;

public class A {
	private int sno=10;
	public void funA() {
		System.out.println("Am Private Cons");
	}
public A() {
	System.out.println("hello");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A b=new A();
b.funA();
	}

}
