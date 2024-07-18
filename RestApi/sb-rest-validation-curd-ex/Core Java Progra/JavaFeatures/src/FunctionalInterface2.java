import java.util.function.Function;
import java.util.function.Predicate;
class Student{
	 String name;
	int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
public class FunctionalInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<Student,String>f=s->
{
	int marks=s.marks;
	String grade=" ";
	if(marks>=90)
		grade="A Grade";
	else if(marks>=60)
		grade="B Grade";
	else if(marks>50)
		grade="C Grade";
	else
		grade="failed";
	return grade;
};

Predicate<Student>p1=p->p.marks>60;

Student[]stu= {
		new Student("Nive",90),
		new Student("kalp",99),
		new Student("Nani",95),
};
for(Student s1:stu) {
	if(p1.test(s1)) {
		System.out.println(s1.getName()+"\t"+ s1.getMarks());
		System.out.println(f.apply(s1));
	}
}
	}

}
