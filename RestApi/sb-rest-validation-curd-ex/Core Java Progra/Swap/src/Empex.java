
public class Empex {
	
	int eno;
	String ename;
	String eadd;
	float esal;
	void displayDetails()
	{
		eno=101;
		ename="nani";
		eadd="Karnataka";
		esal=250.25f;
		System.out.println(eno+"\t"+ename+"\t"+eadd+"\t"+esal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empex e=new Empex();
		System.out.println(e.eno+"\t"+e.ename+"\t"+e.eadd+"\t"+e.esal);
        e.displayDetails();
		System.out.println(e.eno+"\t"+e.ename+"\t"+e.eadd+"\t"+e.esal);
	}

}
