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
        	 conn=DBUtil.getMyConnection();
         }
		 @Override
		 public List<Product> findAll() {
			try {
				PreparedStatement pst=conn.prepareStatement("select * from product");
				ResultSet rs=pst.executeQuery();
				List<Product> plist=new ArrayList<>();
				Product p=null;
				while(rs.next()) {
					if(rs.getDate(5)!=null) {
					     p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5).toLocalDate());
					}else {
						 p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),null);
					}
					plist.add(p);
				}
				return plist;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		 }
		 @Override
		 public boolean saveProduct(Product p) {
			try {
				PreparedStatement pst=conn.prepareStatement("insert into product values(?,?,?,?,?)");
				pst.setInt(1, p.getPid());
				pst.setString(2, p.getPname());
				pst.setInt(3,p.getQty());
				pst.setDouble(4, p.getPrice());
				pst.setDate(5, java.sql.Date.valueOf(p.getMfgdate()));
				int n=pst.executeUpdate();
				return n>0;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		 }
		 @Override
		 public Product findById(int pid) {
			 PreparedStatement pst;
			 try {
				pst = conn.prepareStatement("select * from product where pid=?");
				pst.setInt(1, pid);
				ResultSet rs=pst.executeQuery();
				Product p=null;
				if(rs.next()) {
					if(rs.getDate(5)!=null) {
					     p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5).toLocalDate());
					}else {
						 p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),null);
					}
					return p;
				}
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
				return null;
		 }
}
