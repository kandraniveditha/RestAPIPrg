package com.abstr;

public class FastTrackBatch extends Student {

	public FastTrackBatch(int studentId, String studentname, long mobilenumber, String address, String course) {
		super(studentId, studentname, mobilenumber, address, course);
		// TODO Auto-generated constructor stub
	}

	public int calculateFee(String course) {
		// TODO Auto-generated method stub
		if(course.equals("java"))
			return 55000;
		else if(course.equals("php"))
			return 35000;
		else if(course.equals("Python"))
		return 25000;
		else
			return 15000;
	}

}
