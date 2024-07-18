package com.pms.model;

public class Product {
private int pid;
private String pnamel;
private int pqty;
private int pprice;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPnamel() {
	return pnamel;
}
public void setPnamel(String pnamel) {
	this.pnamel = pnamel;
}
public int getPqty() {
	return pqty;
}
public void setPqty(int pqty) {
	this.pqty = pqty;
}
public int getPprice() {
	return pprice;
}
public void setPprice(int pprice) {
	this.pprice = pprice;
}
public Product(int pid, String pnamel, int pqty, int pprice) {
	super();
	this.pid = pid;
	this.pnamel = pnamel;
	this.pqty = pqty;
	this.pprice = pprice;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}


}
