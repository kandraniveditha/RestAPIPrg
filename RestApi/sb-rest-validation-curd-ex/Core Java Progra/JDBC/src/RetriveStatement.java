import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		ResultSetMetaData rmd=null;
		
//Step 1:Register driver
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			//Step 2:Establish Connection with database software
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suchi101","root","N#4369@qlph");
			
			//Step 3:Create Statement
		 st=con.createStatement();
			
			//step 4:Execute query
			rs=st.executeQuery("select *from Student");
			rmd=rs.getMetaData();
			System.out.println(rmd.getColumnLabel(1)+"\t"+rmd.getColumnLabel(2)+"\t"+rmd.getColumnLabel(3));
			while(rs.next()) {
				int studentno=rs.getInt(1);
				String stu=rs.getString(2);
				String studentadd=rs.getString(3);
				System.out.println(studentno+"\t"+studentadd);
				
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	finally {
		try {
			if(rs!=null)
				rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
