package com.sms.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sms.model.Category;
import com.sms.model.User;

public class ViewDaoImpl implements ViewDao{
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
				
//				cat.setCategoryId(rs.getInt("catid"));
				cat.setCategoryName(rs.getString("catname"));
				cat.setCategoryManufacturingPrice(rs.getInt("tmpcat"));
				cat.setCategoryTotalEarnings(rs.getInt("tprofitcat"));
				return cat;
			}

		});

		return list;
		
				
	}

	@Override
	public List<Category> getAllProducts() {
		return null;
		// TODO Auto-generated method stub
		
	}

}
