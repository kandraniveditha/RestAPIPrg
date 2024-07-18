import java.util.Scanner;
public class StudentDaoImp1 {

	Scanner sc = new Scanner(System.in);
	Student[] addStudents = null;

	public void addStudents() {
		System.out.println("How Many Students Do You Want :");
		int size = sc.nextInt();
		addStudents = new Student[size];

		for (int i = 0; i < addStudents.length; ++i) {
			System.out.println("Enter Student Number :");
			int sno = sc.nextInt();
			System.out.println("Enter Student Name :");
			String sname = sc.next();
			System.out.println("Enter Student address");
			String sadd = sc.next();
			Student stu = new Student(sno, sname, sadd);
			addStudents[i] = stu;
			System.out.println("Student Record Added Successfully");

		}

	}// end of AddStudents

	public Student[] viewAllStudents() {

		return addStudents;
	}

	public Student viewStudent(int sno) {

		
		int k = 0;
		for (Student st : addStudents) {
			if (st.getSno() == sno) {
				++k;
				return st;
			}
		}
		
		return null;
	}

	public void deleteStudent(int sno) {
		
		int k = 0;
		int j = 0;
		for (Student st : addStudents) {
			if (st.getSno() == sno) {

				addStudents[j] = null;
				System.out.println("Given Record is Deleted Successfully");
				++j;
				++k;
				break;
			} else {
				++j;
			}

		}
		if (k == 0)
			System.out.println("Given Record Not Exist");

	}

}
