package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>marks=new ArrayList<Integer>();
		marks.add(100);
		marks.add(250);
		marks.add(350);
		marks.add(25);
		marks.add(50);
		System.out.println(marks);

		Integer i=marks.get(0);
		System.out.println(i);
		
		Collections.sort(marks);
		for(Integer i1:marks) {
			System.out.println(i1);
		}
	}

}
