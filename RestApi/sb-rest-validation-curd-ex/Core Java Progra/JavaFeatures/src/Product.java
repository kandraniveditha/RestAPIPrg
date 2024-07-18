
public class Product {
int pid;
String pname;
int qty;
String price;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public Product(int pid, String pname, int qty, String price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.qty = qty;
	this.price = price;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}

}
