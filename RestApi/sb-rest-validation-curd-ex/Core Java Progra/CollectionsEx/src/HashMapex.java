import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapex {
public static void main(String[] args) {
	HashMap<Integer,String>hm=new HashMap<Integer,String>();
	hm.put(10, "Nive");
	hm.put(12, "sanna");
	hm.put(14, "Bhavya");
	hm.put(8, "KAlps");
	hm.put(5, "Nani");
	System.out.println(hm);
	
	String value=hm.get(10);
	System.out.println(value);
	
	Set<Integer>keySet=hm.keySet();
	
	for(Integer i:keySet) {
		System.out.println(i);
	}
	Collection<String>values=hm.values();
	
	//for(Iterator<E> iterator=values.iterator();iterator.hasNext();) {
		//String string=()
	for(String s: values) {
		System.out.println(s);
	}
	for(Entry<Integer, String> me:hm.entrySet()){
		System.out.println(me.getKey()+"\t"+me.getValue());
	}
}
}
