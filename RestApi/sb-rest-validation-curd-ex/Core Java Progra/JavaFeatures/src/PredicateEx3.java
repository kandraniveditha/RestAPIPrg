import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

public class PredicateEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiPredicate<Integer,Integer>p=(a,b)->(a>b&&b<a);
System.out.println(p.test(10, 20));

int[]x= {0,5,10,20,25,30,35,40};
IntPredicate p1=i->i%2==0;
for(int x1:x) {
	if(p1.test(x1)) {
		System.out.println(x1);
	}
}
}

	
}
