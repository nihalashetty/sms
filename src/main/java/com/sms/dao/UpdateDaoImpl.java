package com.sms.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sms.model.Category;
import com.sms.model.Product;

public class UpdateDaoImpl implements UpdateDao {
	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void updateCat(Category category) {
		String sql = "insert into pcategory (catname) values(?)";
		jdbcTemplate.update(sql, new Object[] { category.getCategoryName() });

	}

	@Override
	public void updateProd(Product product) {

		String sql = "insert into products (pname,pcategory,pquantity,pcprice,psprice) values(?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { product.getProductName(), product.getProductCategory(),
				product.getProductQuantity(), product.getProductCostPrice(), product.getProductSellingPrice() });
	}

	@Override
	public void delProduct(Product product) {
		// TODO Auto-generated method stub
		String sql = "delete from products where pid='" + product.getProductId() + "';";
		jdbcTemplate.update(sql);

	}
}
