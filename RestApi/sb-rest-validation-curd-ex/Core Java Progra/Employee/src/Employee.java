
public class Employee {
private int empid;
private String empfstname;
private String emplastname;
private String empemail;
private int phno;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpfstname() {
	return empfstname;
}
public void setEmpfstname(String empfstname) {
	this.empfstname = empfstname;
}
public String getEmplastname() {
	return emplastname;
}
public void setEmplastname(String emplastname) {
	this.emplastname = emplastname;
}
public String getEmpemail() {
	return empemail;
}
public void setEmpemail(String empemail) {
	this.empemail = empemail;
}
public int getPhno() {
	return phno;
}
public void setPhno(int phno) {
	this.phno = phno;
}
public Employee(int empid, String empfstname, String emplastname, String empemail, int phno) {
	super();
	this.empid = empid;
	this.empfstname = empfstname;
	this.emplastname = emplastname;
	this.empemail = empemail;
	this.phno = phno;
}


}
