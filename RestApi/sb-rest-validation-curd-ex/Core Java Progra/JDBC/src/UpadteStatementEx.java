import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpadteStatementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection con=null;
Statement st=null;
		//step 1:Register a driver
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
		//Step 2: Establish connection with database software
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/suchi101","root","N#4369@qlph");
			if(con!=null)
				System.out.println("Connection is Established");
			else
				System.out.println("Connection is not establoshed");
			//step 3:Create a statement
			st=con.createStatement();
			String query="Updated student set studentadd='hyb' where studentname='rani' ";
			//step 4:Execute query
			int count=st.executeUpdate(query);
			if(count!=0)
				System.out.println("Data Upadted successfully");
			else
				System.out.println("Data Not updated successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		try {
			if(st!=null)
				st.close();
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
