package com.sms.service;

import com.sms.model.Category;
import com.sms.model.Product;

public interface UpdateService {
	void updateCat(Category category);
	void updateProd(Product product);
}
