package com.sms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sms.model.Category;
import com.sms.model.Product;
import com.sms.model.User;

public class ViewDaoImpl implements ViewDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	DataSource datasource;

	@Override

	public List<Category> getAllCategory() {

		List<Category> list = jdbcTemplate.query("SELECT * FROM pcategory", new RowMapper<Category>() {

			@Override
			public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
				Category cat = new Category();

				cat.setCategoryId(rs.getInt("catid"));
				cat.setCategoryName(rs.getString("catname"));
				cat.setCategoryManufacturingPrice(rs.getInt("tmpcat"));
				cat.setCategoryTotalEarnings(rs.getInt("tprofitcat"));
				return cat;
			}

		});

		return list;

	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> list = jdbcTemplate.query("SELECT * FROM products", new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product prod = new Product();

				prod.setProductId(rs.getInt("pid"));
				prod.setProductName(rs.getString("pname"));
				prod.setProductCategory(rs.getInt("pcategory"));
				prod.setProductQuantity(rs.getInt("pquantity"));
				prod.setProductCostPrice(rs.getInt("pcprice"));
				prod.setProductSellingPrice(rs.getInt("psprice"));
				prod.setProductOrdersMade(rs.getInt("ordersmade"));
				prod.setProductEarnings(rs.getInt("pearnings"));
				return prod;
			}

		});

		return list;

	}

	@Override
	public List<Product> getCategory(Product product) {
		List<Product> list = jdbcTemplate.query("SELECT * FROM products where pcategory='"+product.getProductCategory()+"'", new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product prod = new Product();

				prod.setProductId(rs.getInt("pid"));
				prod.setProductName(rs.getString("pname"));
				prod.setProductCategory(rs.getInt("pcategory"));
				prod.setProductQuantity(rs.getInt("pquantity"));
				prod.setProductCostPrice(rs.getInt("pcprice"));
				prod.setProductSellingPrice(rs.getInt("psprice"));
				prod.setProductOrdersMade(rs.getInt("ordersmade"));
				prod.setProductEarnings(rs.getInt("pearnings"));
				return prod;
			}

		});
		System.out.println(list);
		return list;

	}
	
	
	

}
