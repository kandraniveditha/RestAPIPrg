package com.cms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.cms.dao.CustomerDAO;
import com.cms.model.Customer;
import com.pms.config.ConnectionManager;
import com.pms.query.QueryConstants;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public int addCustomer(Customer cut) {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstants.INSERT_QUERY);
			ps.setInt(1,cut.getcid() );
			ps.setString(2,cut.getFname());
			ps.setString(3, cut.getLname());
			ps.setString(4,cut.getEmail());
			ps.setLong(5, cut.getMbphone());
			
			count=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	finally 
	{
		try {
			ConnectionManager.closeConnection(con, ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return count;
	}

	@Override
	public List<Customer> viewAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer viewCustomer(int cuid) {
		// TODO Auto-generated method stub
		return null;
	}

}
