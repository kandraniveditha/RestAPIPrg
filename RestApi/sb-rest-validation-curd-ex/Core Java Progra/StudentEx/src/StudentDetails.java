
import java.util.Scanner;

public class StudentDetails {

	Scanner sc = new Scanner(System.in);
	StudentDaoImp1 daoImpl = new StudentDaoImp1();

	public void stuDetails() {

		while (true) {
			System.out.println("------------------------------------------------------");
			System.out.println("                  1)AddStudent                        ");
			System.out.println("                  2)ViewAllStudents                        ");
			System.out.println("                  3)viewStudent                        ");
			System.out.println("                  4)DeleteStudent                        ");
			System.out.println("                  5)Back                        ");
			System.out.println("------------------------------------------------------");
			System.out.println("Enter The Choice");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				daoImpl.addStudents();
				stuDetails();
				break;
			case 2:
				Student[] viewAllStudents = daoImpl.viewAllStudents();

				if (viewAllStudents != null) {
					for (Student st : viewAllStudents) {
						if (st != null)
							System.out.println(st.getSno() + "\t" + st.getSname() + "\t" + st.getAdd());
					}
				} else {
					System.out.println("Records Are not Exisit");
				}
				stuDetails();
				break;
			case 3:

				System.out.println("Enter Student Number");
				Student st = daoImpl.viewStudent(sc.nextInt());

				if (st != null)
					System.out.println(st.getSno() + "\t" + st.getSname() + "\t" + st.getAdd());
				else
					System.out.println("Given Record Not Found");
				stuDetails();
				break;
			case 4:
				System.out.println("Enter Student Number");
				daoImpl.deleteStudent(sc.nextInt());
				stuDetails();
				break;
			case 5:
				StudentClient.main(null);
			default:
				System.out.println("Choose 1 to 5 Between");

			}// end of switch
		} // end of while

	}

}

