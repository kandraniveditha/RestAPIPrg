package com.cms.pojo;

public class Customer {

	private int cid;
	private String fname;
	private String lname;
	private String emailpass;
	private long mbphone;
	public Customer(int cid, String fname, String lname, String emailpass, long mbphone) {
		super();
		cid = cid;
		fname = fname;
		lname = lname;
		emailpass = emailpass;
		this.mbphone = mbphone;
	}
	public int getcid() {
		return cid;
	}
	public void setcid(int cid) {
		cid = cid;
	}
	public String getfname() {
		return fname;
	}
	public void setfname(String fname) {
		fname = fname;
	}
	public String getlname() {
		return lname;
	}
	public void setlname(String lname) {
		lname = lname;
	}
	public String getemailpass() {
		return emailpass;
	}
	public void setemailpass(String emailpass) {
		emailpass = emailpass;
	}
	public long getmbphone() {
		return mbphone;
	}
	public void setmbphone(long mbphone) {
		this.mbphone = mbphone;
	}
	
}
