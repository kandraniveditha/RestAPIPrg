package com.abstr;

import java.util.Scanner;

public class StudentClient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student ID:");
		int id=sc.nextInt();
		System.out.println("Enter Student Name:");
		String sname=sc.next();
		System.out.println("Enter Student Mobile:");
		long mbnum=sc.nextLong();
		System.out.println("Enter Student Address:");
		String add=sc.next();
		System.out.println("Enter Student Course:");
		String cou=sc.next();
		
		FastTrackBatch fb=new FastTrackBatch(id,sname,mbnum,add,cou);
		int fee=fb.calculateFee(fb.getCourse());
		System.out.println(fb.getStudentId()+ "\t" +fb.getStudentname()+ "\t" +fb.getMobilenumber()+ "\t" +fb.getAddress()+ "\t"+ fb.getCourse());
	}
	
}
