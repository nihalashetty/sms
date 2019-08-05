package com.sms.dao;


import java.util.List;

import com.sms.model.Category;

public interface ViewDao {
	List<Category> getAllCategory();
	List<Category> getAllProducts();
}
