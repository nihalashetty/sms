package com.sms.service;

import com.sms.model.*;


import java.util.List;


public interface ViewService {
	List<Category> viewCategory();
	List<Product> viewProduct();
	List<Product> searchCategory(Product product);
	List<Supplier> viewSuppliers();
	List<Order> viewPendingOrders();
	List<Order> viewDispatchedOrders();
	List<User> viewCustomer();
	List<Category> chooseCategory(Category category );
}
