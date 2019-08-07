package com.sms.dao;


import java.util.List;

import com.sms.model.Category;
import com.sms.model.Product;

public interface ViewDao {
	List<Category> getAllCategory();
	List<Product> getAllProduct();
	List<Product> getCategory(Product product);
}
