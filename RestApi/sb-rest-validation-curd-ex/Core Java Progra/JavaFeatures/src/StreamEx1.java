import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>marks=new ArrayList<>();
marks.add(50);
marks.add(60);
marks.add(25);
marks.add(53);
marks.add(34);
System.out.println(marks);
//Stream<Integer>updateMarks=marks.stream().map(i->i+5).filter(i->i>35);
//updateMarks.forEach(e->System.out.println(e));
	//updateMarks.forEach(System.out::println);
	
	//Set<Integer>updateMarks=marks.stream().map(i->i+5).collects.toSet();
	//updateMarks.forEach(e->System.out.println(e));
	//	updateMarks.forEach(System.out::println);
		//updateMarks.stream().forEachOrdered(System.out::println);
	
//with out using stream convert list to set hashset<Integer>
	//HashSet<Integer>hs=new HashSet<>();
	//hs.forEach(System.out::println);
	
//convert list to set 
Stream<Integer>updateMarks=marks.stream().map(i->i+10);

//convert stream object to set

}

}
