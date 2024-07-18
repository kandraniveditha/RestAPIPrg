package jaba8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForEachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>marks=new ArrayList<>();
marks.add(100);
marks.add(200);
marks.add(300);
marks.add(500);
marks.add(600);

marks.forEach((m)->System.out.println(m));

Collections.sort(marks,(p1,p2)->{
	return p2.compareTo(p1);
}
);
marks.forEach((m)->
{
	System.out.println(m);
}
);
	}

}
