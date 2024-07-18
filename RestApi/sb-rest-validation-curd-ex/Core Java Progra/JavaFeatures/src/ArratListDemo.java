import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class ArratListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>strList= Arrays.asList("Nive","kandra","chow","lakshmi","","");
 
long count=strList.stream().filter(x->x.isEmpty()).count();
System.out.println(count);

//count string whose length is more than three
long count2=strList.stream().filter(x->x.length()>3).count();
System.out.println(count2);

//count number of string which starts with "a"
long count3=strList.stream().filter(x->x.startsWith("N")).count();
System.out.println(count3);
System.out.println("-----------------------------------------------");

//remove all empty string from list
List<String>filtered=strList.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
	filtered.forEach(System.out::println);
	System.out.println("-----------------------------------------------");
	
//create a list with string more than 2 characters
	List<String>filtered1=strList.stream().filter(x->x.length()>2).collect(Collectors.toList());
filtered1.forEach(System.out::println);
System.out.println("-----------------------------------------------");

//convert string to upper case and join with coma
String StringList=strList.stream().map(x->x.toUpperCase()+",").collect(Collectors.joining(","));
System.out.println(StringList);
	
//sepereat coma list
List<String>collect=strList.stream().map(x->x.toUpperCase()+" , ").collect(Collectors.toList());
collect.forEach(System.out::println);
System.out.println("-----------------------------------------------");

//remove the duplicate elements from the list
List<Integer>numbers=Arrays.asList(9,10,3,4,6,7,4);
List<Integer>collect2=numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
collect2.forEach(System.out::println);
System.out.println("-----------------------------------------------");

//Creat a list of the square of all Distrinct numbers
List<Integer>collect3=numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
collect3.forEach(System.out::println);
System.out.println("-----------------------------------------------");

//Get count min,max,sum and the average for numbers
List<Integer>primes=Arrays.asList(2,3,5,7,11,13,17,19,13,29);
IntSummaryStatistics summarystatistics=primes.stream().mapToInt((x)->x).summaryStatistics();
System.out.println(summarystatistics.getCount());
System.out.println(summarystatistics.getMax());
System.out.println(summarystatistics.getMin());
	}

}
