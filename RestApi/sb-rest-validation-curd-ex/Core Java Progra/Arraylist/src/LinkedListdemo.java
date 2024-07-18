import java.util.LinkedList;

public class LinkedListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList al=new LinkedList();

		al.add(100);
		al.add(250);
		al.add(365);
		al.add(125);
		al.add("Niveditha");
		al.add(null);
		System.out.println(al);
		
		al.addFirst(653);

		al.add(1,250.25);

		System.out.println(al);

		Object obj=al.get(1);
		double sfee=(Double)obj;
		System.out.println(sfee);

		for(int i=0;i<al.size();++i) {
			Object obj1=al.get(i);
			System.out.println(obj1);

		}
		System.out.println("----------------------------------------------");
		for(Object ob:al) {
			System.out.println(ob);
		}
		System.out.println("-----------------------------------------------");
	}

}
