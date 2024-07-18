import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();

		al.add(100);
		al.add(250);
		al.add(365);
		al.add(125);
		al.add("Niveditha");
		al.add(null);
		System.out.println(al);
		
		ArrayList al1=new ArrayList();
		al1.add("Niveditha");
		al1.add(100);
		System.out.println(al1);
		
		al.addAll(al1);
		System.out.println(al);
		
		//al.removeAll(al1);
		al.retainAll(al1);
		System.out.println(al);
	}

}
