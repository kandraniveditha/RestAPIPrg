import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingStatementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection con=null;
Statement stmt=null;
		try {
con=ConnectionManager.getConnection();
stmt=con.createStatement();
stmt.addBatch("Insert into student values(14,'Sanna','SouthAf')");
stmt.addBatch("Insert into student values(15,'Lkashmi','pavagada')");
int[]count =stmt.executeBatch();
for(int i:count) {
	System.out.println(i);
}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
