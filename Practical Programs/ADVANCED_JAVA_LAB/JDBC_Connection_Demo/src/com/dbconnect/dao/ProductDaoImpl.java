package com.dbconnect.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbconnect.model.Product;

public class ProductDaoImpl implements ProductDao {
	static Connection conn;
	static {
		conn = DBUtil.getMyConnection();
	}

	@Override
	public boolean saveProduct(Product p) {
		try {
			PreparedStatement pst = conn.prepareStatement("insert into product values(?,?,?,?,?)");
			pst.setInt(1, p.getPid());
			pst.setString(2, p.getPname());
			pst.setInt(3, p.getQty());
			pst.setDouble(4, p.getPrice());
			java.sql.Date sdt = java.sql.Date.valueOf(p.getMfgdate());
			pst.setDate(5, sdt);
			int n = pst.executeUpdate();
			if (n > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Product> findAll() {
		try {
			PreparedStatement pst = conn.prepareStatement("select * from product");
			ResultSet rs = pst.executeQuery();
			List<Product> plist = new ArrayList<>();
			Product p = null;
			while (rs.next()) {

				if (rs.getDate(5) != null) {
					p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4),
							rs.getDate(5).toLocalDate());
				} else {
					p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), null);
				}
				plist.add(p);

			}
			return plist;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public Product findById(int id) {
		try {
			PreparedStatement pst = conn.prepareStatement("select * from product where pid=?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			Product p = null;
			if (rs.next()) {
				if (rs.getDate(5) != null) {
					p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4),
							rs.getDate(5).toLocalDate());
				} else {
					p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), null);
				}
				return p;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> findAllSortedByName() {
		try {
			PreparedStatement pst = conn.prepareStatement("select * from product order by pname");
			ResultSet rs = pst.executeQuery();
			List<Product> plist = new ArrayList<>();
			Product p = null;
			while (rs.next()) {
				if (rs.getDate(5) != null) {
					p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4),
							rs.getDate(5).toLocalDate());
				} else {
					p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), null);
				}
				plist.add(p);
			}
			return plist;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public boolean updateById(int pid, int qty, double pr) {
		try {
			PreparedStatement pst = conn.prepareStatement("update product set qty=?,price=? where pid=?");
			pst.setInt(1, qty);
			pst.setDouble(2, pr);
			pst.setInt(3, pid);
			int n = pst.executeUpdate();
			if (n > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean removeById(int pid) {
		try {
			PreparedStatement pst = conn.prepareStatement("delete from product where pid=?");
			pst.setInt(1, pid);
			int n = pst.executeUpdate();
			if (n > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
