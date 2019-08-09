package com.sms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sms.model.Category;
import com.sms.model.Order;
import com.sms.model.Product;
import com.sms.model.Supplier;
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
		List<Product> list = jdbcTemplate.query(
				"SELECT * FROM products where pcategory='" + product.getProductCategory() + "'",
				new RowMapper<Product>() {

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

	@Override
	public List<Supplier> getAllSuppliers() {

		List<Supplier> list = jdbcTemplate.query("SELECT * FROM suppliers", new RowMapper<Supplier>() {

			@Override
			public Supplier mapRow(ResultSet rs, int rowNum) throws SQLException {
				Supplier supp = new Supplier();

				supp.setSupplierId(rs.getInt("sid"));
				supp.setSupplierName(rs.getString("suppliername"));
				supp.setSupplierCity(rs.getString("suppliercity"));
				supp.setSupplierPhone(rs.getInt("supplierphone"));
				supp.setSupplierEmail(rs.getString("supplieremail"));
				return supp;
			}

		});
		return list;

	}

	@Override
	public List<Order> getAllPendingOrders() {
		List<Order> list = jdbcTemplate.query("SELECT * FROM `order` where deliverystatus='pending'", new RowMapper<Order>() {

			@Override
			public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
				Order ord=new Order();

				ord.setOrderId(rs.getInt("oid"));
				ord.setCategoryId(rs.getInt("catid"));
				ord.setProductId(rs.getInt("pid"));
				ord.setCustomerId(rs.getInt("cid"));
				ord.setQuantity(rs.getInt("quantity"));
				ord.setCity(rs.getString("city"));
				ord.setDeliveryStatus(rs.getString("deliverystatus"));
				
				return ord;
			}

		});
		return list;
	}

	@Override
	public List<Order> getAllDispatchedOrders() {
		// TODO Auto-generated method stub
		List<Order> list = jdbcTemplate.query("SELECT * FROM `order` where deliverystatus='dispatched'", new RowMapper<Order>() {

			@Override
			public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
				Order ord=new Order();

				ord.setOrderId(rs.getInt("oid"));
				ord.setCategoryId(rs.getInt("catid"));
				ord.setProductId(rs.getInt("pid"));
				ord.setCustomerId(rs.getInt("cid"));
				ord.setQuantity(rs.getInt("quantity"));
				ord.setCity(rs.getString("city"));
				ord.setDeliveryStatus(rs.getString("deliverystatus"));
				ord.setSupplierId(rs.getInt("suplierid"));
				
				return ord;
			}

		});
		return list;
	}

	@Override
	public List<User> getAllCustomers() {
		List<User> list = jdbcTemplate.query("SELECT * FROM customers", new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();

				user.setUserid(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setAddress(rs.getString("address"));
				user.setPhone(rs.getInt("phone"));
				user.setBankname(rs.getString("bankname"));
				user.setAccountnumber(rs.getInt("accountnumber"));
				return user;
			}

		});

		return list;
	}

	@Override
	public List<Category> getChosenCat(Category category) {
		List<Category> list = jdbcTemplate.query(
				"SELECT * FROM pcategory where catid='" + category.getCategoryId() + "'",
				new RowMapper<Category>() {

					@Override
					public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
						Category cate=new Category();

						cate.setCategoryId(rs.getInt("catid"));
						cate.setCategoryName(rs.getString("catname"));
						cate.setCategoryManufacturingPrice(rs.getInt("tmpcat"));
						cate.setCategoryTotalEarnings(rs.getInt("tprofitcat"));
						return cate;
					}

				});
		return list;
	}

	

}
