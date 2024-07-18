package com.lms.pojo;

public class Library {

	private int lid;
	private String lname;
	private int lqyt;
	public Library(int lid, String lname, int lqyt) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.lqyt = lqyt;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getLqyt() {
		return lqyt;
	}
	public void setLqyt(int lqyt) {
		this.lqyt = lqyt;
	}
	

}
