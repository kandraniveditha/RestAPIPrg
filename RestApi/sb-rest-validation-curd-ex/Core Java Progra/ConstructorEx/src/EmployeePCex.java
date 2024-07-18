
public class EmployeePCex {

	int eno;
 String ename;
 String eadd;

	public EmployeePCex(int eno, String ename, String eadd) {
	
	this.eno = eno;
	this.ename = ename;
	this.eadd = eadd;
	System.out.println("Parameterizes Constructor");
}
void displayDetails() {
	System.out.println(eno+ "\t" + ename + "\t" + eadd);
	
}

	public EmployeePCex() {
eno=1;
ename="Swamy";
eadd="Tumkur";
	// TODO Auto-generated constructor stub
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeePCex ep =new EmployeePCex(100,"Nive","Bangalore");
EmployeePCex ep1 =new EmployeePCex(102,"kandra","Mysore");

ep.displayDetails();
ep1.displayDetails();
	}

}
