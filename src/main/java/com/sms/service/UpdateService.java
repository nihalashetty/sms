package com.sms.service;

import com.sms.model.Category;
import com.sms.model.Order;
import com.sms.model.Product;

public interface UpdateService {
	void updateCat(Category category);
	void updateProd(Product product);
	void delProduct(Product product);
	void dispatchProduct(Order order);
	void updateChosenCat(Category category);
}
