package com.pms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pms.config.ConnectionManager;
import com.pms.dao.ProductDAO;
import com.pms.model.Product;
import com.pms.query.QueryConstants;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public int addProducts(Product pro) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstants.INSERT_QUERY);
			ps.setInt(1,pro.getPid() );
			ps.setString(2,pro.getPnamel());
			ps.setInt(3, pro.getPqty());
			ps.setInt(4,pro.getPprice());
			
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
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int count=0;
		List<Product>addProducts=new ArrayList<Product>();
		
			try {
				con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstants.SELECT_QUERY);
		rs=	ps.executeQuery();
				while(rs.next()) {
					int pid=rs.getInt(1);
					String pnamel=rs.getString(2);
					int pqty=rs.getInt(3);
					int pprice=rs.getInt(4);
					Product product=new Product(pid,pnamel,pqty,pprice);
					addProducts.add(product);
				}			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					ConnectionManager.closeConnection(con, ps,rs);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		return addProducts;
	}

	@Override
	public Product viewProduct(int pid) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int count=0;
		Product product=null;
		List<Product>addProducts=new ArrayList<Product>();
		
			try {
				con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstants.SELECT_SPECIFIC_QUERY);
	        ps.setInt(1, pid);
			rs=ps.executeQuery();
			if(rs.next()) {
				int id=rs.getInt(1);
				String pnamel=rs.getString(2);
				int pqty=rs.getInt(3);
				int pprice=rs.getInt(4);
				 product=new Product(pid,pnamel,pqty,pprice); 
			}
						
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					ConnectionManager.closeConnection(con, ps,rs);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		
		
		
		
		
		return product;
	}

}
