package com.sms.dao;


import java.util.List;

import com.sms.model.Category;
import com.sms.model.Order;
import com.sms.model.Product;
import com.sms.model.Supplier;
import com.sms.model.User;

public interface ViewDao {
	List<Category> getAllCategory();
	List<Product> getAllProduct();
	List<Product> getCategory(Product product);
	List<Supplier> getAllSuppliers();
	List<Order> getAllPendingOrders();
	List<Order> getAllDispatchedOrders();
	List<User> getAllCustomers();
}
