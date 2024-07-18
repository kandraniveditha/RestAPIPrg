import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistEx {
public static void main(String[] args) {
	ArrayList<Integer>a1=new ArrayList<Integer>();
	a1.add(100);
	a1.add(250);
	a1.add(450);
	a1.add(360);
	a1.add(254);
	
	for(Integer i:a1) {
		System.out.println(i);
	}
	System.out.println();
	System.out.println("------------------------");
	Iterator <Integer> it=a1.iterator();
	while(it.hasNext()) {
		Integer next=it.next();
		System.out.println(next+" ");
	}
	System.out.println();
	System.out.println("--------------------------");
	System.out.println("Read the data forward direction and backward direction");
	ListIterator<Integer>lit=a1.listIterator();
	while(lit.hasNext()) {
		Integer next=lit.next();
		System.out.println(next+" ");
	}
	System.out.println();
	System.out.println("------------------------------------");
	
	while(lit.hasPrevious()) {
		Integer i1=lit.previous();
		System.out.println(i1+" ");
	}
	System.out.println();
	System.out.println("------------------------------------");
}
}
