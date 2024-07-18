import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Student> addStudents=new TreeSet<>();
addStudents.add(new Student(101, "Nive", "hyb"));
addStudents.add(new Student(102, "Nived", "bng"));
addStudents.add(new Student(103, "Nivedi", "bngl"));
addStudents.add(new Student(104, "Nivedit", "bnglo"));

System.out.println(addStudents);

for(Student st: addStudents) {
	System.out.println(st.getSno()+"\t"+st.getSname()+"\t"+st.getAdd());
}
	}

}
