package com.pms.query;

public interface QueryConstants {
String INSERT_QUERY="Insert into Product values(?,?,?,?)";
	String SELECT_QUERY="select *from product";
	String SELECT_SPECIFIC_QUERY="Select*from Product where pid=?";
	
}
