package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sms.dao.ViewDao;
import com.sms.model.Category;
import com.sms.model.Order;
import com.sms.model.Product;
import com.sms.model.Supplier;
import com.sms.model.User;

public class ViewServiceImpl implements ViewService{
	@Autowired
	ViewDao viewDao;
	
	
	@Override
	public List<Category> viewCategory() {
		return viewDao.getAllCategory();
		
	}

	@Override
	public List<Product> viewProduct() {
		return viewDao.getAllProduct();
		
	}

	@Override
	public List<Product> searchCategory(Product product) {
		return viewDao.getCategory(product);
	}

	@Override
	public List<Supplier> viewSuppliers() {
		// TODO Auto-generated method stub
		return viewDao.getAllSuppliers();
	}

	@Override
	public List<Order> viewPendingOrders() {
		// TODO Auto-generated method stub
		return viewDao.getAllPendingOrders();
	}

	@Override
	public List<Order> viewDispatchedOrders() {
		// TODO Auto-generated method stub
		return viewDao.getAllDispatchedOrders();
	}

	@Override
	public List<User> viewCustomer() {
		// TODO Auto-generated method stub
		return viewDao.getAllCustomers();
	}

	@Override
	public List<Category> chooseCategory(Category category) {
		// TODO Auto-generated method stub
		return viewDao.getChosenCat(category);
	}

	@Override
	public int getTotalProfit() {
		// TODO Auto-generated method stub
		return viewDao.getTotalProfit();
	}



}
