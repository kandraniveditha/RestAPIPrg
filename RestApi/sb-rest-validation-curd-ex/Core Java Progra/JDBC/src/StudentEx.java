import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
//step 1: Register a driver
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
//Establish connection with database Software
	 con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/suchi101","root","N#4369@qlph");
	if(con!=null)
		System.out.println("Connection is Established");
	else
		System.out.println("Connection is not Established");
	
	//step 3:create statement
	st=con.createStatement();
	String query="Insert into student values(101,'nara','Mang')";
	
	//step 4: Execute Query
	int count=st.executeUpdate(query);
	if(count!=0)
		System.out.println("Data Inserted successfully");
	else
		System.out.println("Data not Inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	finally {
		try {
			if(st!=null)
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(con!=null)
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

}
