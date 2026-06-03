package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;


@Repository
public class ProductDaoImpl implements ProductDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
	public boolean saveProduct(Product p) {
		int n=jdbcTemplate.update("insert into Product values(?,?,?,?,?,?)",
				               new Object[] {p.getPid(),p.getPname(),p.getQty(),p.getPrice(),p.getMfgdate(),p.getCid()});
	   return n>0;
	}

	@Override
	public List<Product> findAllProduct() {
		/*List<Product> plst=jdbcTemplate.query("select * from product", new RowMapper() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setQty(rs.getInt(3));
				p.setPrice(rs.getDouble(4));
				p.setMfgdate(rs.getDate(5).toLocalDate());
				p.setCid(rs.getInt(6));
				return p;
			}
			
		})*/
	List<Product> plst=jdbcTemplate.query("select * from product",(rs,num)->{
		Product p=new Product();
		p.setPid(rs.getInt(1));
		p.setPname(rs.getString(2));
		p.setQty(rs.getInt(3));
		p.setPrice(rs.getDouble(4));
		p.setMfgdate(rs.getDate(5).toLocalDate());
		p.setCid(rs.getInt(6));
		return p;
	});
	return plst;
	}

	@Override
	public boolean removeById(int id) {
		int n=jdbcTemplate.update("delete from product where pid=?",new Object[] {id});
		return n>0;
	}

	@Override
	public boolean modifyById(int id, int qty, double price) {
		int n=jdbcTemplate.update("update product set qty=?,price=? where pid=?",
				                                        new Object[] {qty,price,id});
		return n>0;
	}

	@Override
	public Product findById(int id) {
		/*Product p1=jdbcTemplate.queryForObject("select * from product where pid=?", new Object[] {id},(rs,num)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			p.setMfgdate(rs.getDate(5).toLocalDate());
			p.setCid(rs.getInt(6));
			return p
		});*/
		
		Product p1=jdbcTemplate.queryForObject("select * from product where pid=?", new Object[] {id},
				new BeanPropertyRowMapper<>(Product.class));
	    return p1;
	}

	@Override
	public List<Product> findByPrice(double pr) {
		List<Product> plst=jdbcTemplate.query("select * from product where price>?", new Object[] {pr},
				new BeanPropertyRowMapper<>(Product.class));
	    return plst;
	}

}
