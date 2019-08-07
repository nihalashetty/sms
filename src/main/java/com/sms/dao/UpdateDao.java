package com.sms.dao;

import com.sms.model.Category;
import com.sms.model.Product;

public interface UpdateDao {
	void updateCat(Category category);
	void updateProd(Product product);

}
