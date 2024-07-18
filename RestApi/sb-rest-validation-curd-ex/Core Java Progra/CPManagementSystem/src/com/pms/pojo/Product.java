package com.pms.pojo;

public class Product {
private int pid;
private String pname;
private int pqty;
private int pprice;
public Product(int pid, String pname, int pqty, int pprice) {
	super();
	pid = pid;
	pname = pname;
	pqty = pqty;
	pprice = pprice;
}
public int getpid() {
	return pid;
}
public void setpid(int pid) {
	pid = pid;
}
public String getpname() {
	return pname;
}
public void setpname(String pname) {
	pname = pname;
}
public int getpqty() {
	return pqty;
}
public void setpqty(int pqty) {
	pqty = pqty;
}
public int getpprice() {
	return pprice;
}
public void setPPrice(int pprice) {
	pprice = pprice;
}



}
