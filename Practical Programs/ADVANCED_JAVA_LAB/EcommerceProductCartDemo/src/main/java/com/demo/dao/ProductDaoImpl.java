package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Product;

public class ProductDaoImpl implements ProductDao{
	static Connection conn;
	static {
		conn=DBUtils.getMyConnection();
	}
	@Override
	public List<Product> findAllProductByCid(int catid) {
		try {
			PreparedStatement pst=conn.prepareStatement("select * from product where cid=?");
		    pst.setInt(1, catid);
		    ResultSet rs=pst.executeQuery();
		    List<Product> plst=new ArrayList<>();
		    while(rs.next()) {
		    	Product p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5).toLocalDate(),rs.getInt(6));
		    	plst.add(p);
		    }
		    return plst;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
