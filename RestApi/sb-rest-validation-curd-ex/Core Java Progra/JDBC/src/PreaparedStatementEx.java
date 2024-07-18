import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreaparedStatementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
//step 1:Register Driver
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			//step 2:Establish connection with database Software
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suchi101","root","N#4369@qlph");
			
			//step 3:Prepared statement
			ps=con.prepareStatement("Insert into Student values(?,?,?)");
		ps.setInt(1, 19);
		ps.setString(2,"ChowdaryNive" );
		ps.setString(3,"Uk");
	
			//step 4:execute query
			int count=ps.executeUpdate();
			if(count!=0) {
				System.out.println("Data Inserted sucessfully");
				
			}
			else
			{
				System.out.println("data not inserted successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
