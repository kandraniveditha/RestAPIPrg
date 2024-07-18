import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>evenNum=new ArrayList<>();
evenNum.add(10);
evenNum.add(25);
evenNum.add(2);
evenNum.add(5);
evenNum.add(7);
System.out.println(evenNum);
//w.a.p find out even number in arraylist
//for(Integer i:evenNum) {
//	if(i%2==0) {
//		System.out.println("Even number:"+i);
		
//	}
//}

//for each with lambad expression
//evenNum.forEach(i-> {
	//if(i%2==0)
		//System.out.println("Even Number "+i);
//});

//Stream using
//ream<Integer>stream=evenNum.stream().filter(i->i%2==0);
//ream.forEach(e->System.out.println(e));

Stream<Integer>evenEx=evenNum.stream().filter(i->i>5);
	evenEx.forEach(e->System.out.println(e));
	

	}

}
