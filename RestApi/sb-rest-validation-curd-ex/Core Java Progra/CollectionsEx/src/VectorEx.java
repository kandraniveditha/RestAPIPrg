import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<Integer> v=new Vector();
v.add(250);
v.add(125);
v.add(365);
v.add(145);
System.out.println(v);

Enumeration<Integer> eme=v.elements();
while(eme.hasMoreElements()) {
	
	Integer next=eme.nextElement();
	System.out.println(next);
}
	}

}
