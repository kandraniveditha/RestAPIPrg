package com.abstr;

public abstract class Student {

	private int studentId;
	private String Studentname;
	private long mobilenumber;
private String address;
private String Course;

public int getStudentId() {
	return studentId;
}
public String getStudentname() {
	return Studentname;
}
public long getMobilenumber() {
	return mobilenumber;
}
public String getAddress() {
	return address;
}
public String getCourse() {
	return Course;
}
public abstract int calculateFee(String course);

public Student(int studentId, String studentname, long mobilenumber, String address, String course) {
	
	this.studentId = studentId;
	this.Studentname = studentname;
	this.mobilenumber = mobilenumber;
	this.address = address;
	this.Course = course;
}
}