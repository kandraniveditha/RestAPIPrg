import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
tm.put(10, "Kandra");
tm.put(5,"Rani" );
tm.put(2, "Kalps");
tm.put(30,"shiva" );
System.out.println(tm);
System.out.println(tm.firstKey());
System.out.println(tm.lastKey());
System.out.println(tm.tailMap(10));

	}

}
