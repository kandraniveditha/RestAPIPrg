
public class Student implements Comparable<Student> {
private int sno;
private String sname;
private String add;
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public Student(int sno, String sname, String add) {
	super();
	this.sno = sno;
	this.sname = sname;
	this.add = add;
}
@Override
public int compareTo(Student st) {
	// TODO Auto-generated method stub
	if(sno==st.getSno())
	return -1;
	else if(sno>st.getSno())
		return +1;
	else
	
	return 0;
}

}
