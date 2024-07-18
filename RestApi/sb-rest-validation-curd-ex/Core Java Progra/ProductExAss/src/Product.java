
public class Product {
private int prodid;
private String Prodname;
private String Prodqty;
private int produprice;

public int getProdid() {
	return prodid;
}
public void setProdid(int prodid) {
	this.prodid = prodid;
}
public String getProdname() {
	return Prodname;
}
public void setProdname(String prodname) {
	this.Prodname = prodname;
}
public String getProdqty() {
	return Prodqty;
}
public void setProdqty(String prodqty) {
	this.Prodqty = prodqty;
}
public int getProduprice() {
	return produprice;
}
public void setProduprice(int produprice) {
	this.produprice = produprice;
}
public Product(int prodid, String prodname, String prodqty, int produprice) {
	super();
	this.prodid = prodid;
	this.Prodname = prodname;
	this.Prodqty = prodqty;
	this.produprice = produprice;
}

}


