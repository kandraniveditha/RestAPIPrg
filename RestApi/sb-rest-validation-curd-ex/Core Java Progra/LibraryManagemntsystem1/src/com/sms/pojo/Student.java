package com.sms.pojo;

public class Student {
private int sid;
private String sname;
private String Sreg;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSreg() {
	return Sreg;
}
public void setSreg(String sreg) {
	Sreg = sreg;
}
public Student(int sid, String sname, String sreg) {
	super();
	this.sid = sid;
	this.sname = sname;
	Sreg = sreg;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

}
