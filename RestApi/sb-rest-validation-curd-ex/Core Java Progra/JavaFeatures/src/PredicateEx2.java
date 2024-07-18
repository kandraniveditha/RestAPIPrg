import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String name;
	double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}
public class PredicateEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Employee>a1=new ArrayList<Employee>();
a1.add(new Employee("Nive",2500));
a1.add(new Employee("Nivedi",3500));
a1.add(new Employee("Nivedit",4500));
a1.add(new Employee("Niveditha",5500));

//with out predicate
for(Employee emp:a1) {
	if(emp.salary<3000) {
		System.out.println(emp.name+"\t"+emp.salary);
	}
}
//with predicate
Predicate<Employee>p2=e->e.salary>3000;
for(Employee emp:a1) {
	if(p2.test(emp)) {
		System.out.println(emp.name+"\t"+emp.salary);
		
	}
}

	}

}
