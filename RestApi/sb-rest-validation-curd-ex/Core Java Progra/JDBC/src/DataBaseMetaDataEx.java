import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseMetaDataEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection con=null;

try {
	con=ConnectionManager.getConnection();
	DatabaseMetaData dbmd =con.getMetaData();
	System.out.println("Driver name:"+dbmd.getDriverName());
	System.out.println("Driver name:"+dbmd.getUserName());
	System.out.println("Driver name:"+dbmd.getDatabaseProductName());
    String table[]= {"TABLE"};
	ResultSet rs=dbmd.getTables(null,null,null,table);
while(rs.next()) {
	System.out.println(rs.getString(3));
}

} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
