import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IdentityHashMap hm=new IdentityHashMap();
Integer i1=new Integer(10);
Integer i2=new Integer(10);
hm.put(i1, "Shiv");
hm.put(i2,"Chowdary");
System.out.println(hm);  //{10==}

Integer i3=90;
Integer i4=20;  //i4=90
hm.put(i3,"kalps");
hm.put(i4,"Nani");
System.out.println(hm);


	}

}
