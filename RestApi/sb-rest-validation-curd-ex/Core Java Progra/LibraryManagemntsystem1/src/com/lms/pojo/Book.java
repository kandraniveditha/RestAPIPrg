package com.lms.pojo;

public class Book {
	private int bid;
	private String bname;
	private int bqyt;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBqyt() {
		return bqyt;
	}
	public void setBqyt(int bqyt) {
		this.bqyt = bqyt;
	}
	public Book(int bid, String bname, int bqyt) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bqyt = bqyt;
	}
	
}
