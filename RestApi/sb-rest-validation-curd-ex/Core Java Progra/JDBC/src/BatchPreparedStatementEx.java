import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchPreparedStatementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection con=null;
PreparedStatement ps=null;
try {
	con=ConnectionManager.getConnection();
	ps=con.prepareStatement("Insert into student values(?,?,?,)");
	ps.setInt(1, 99);
	ps.setString(2, "mj");
	ps.setString(2,"asu");
	
	ps.addBatch();
	ps.setInt(1, 120);
	ps.setString(2, "mj");
	ps.setString(3, "asu");
	ps.addBatch();
	
	int[] count=ps.executeBatch();
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
