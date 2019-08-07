package com.sms.service;

import com.sms.model.*;


import java.util.List;


public interface ViewService {
	List<Category> viewCategory();
	List<Product> viewProduct();
	List<Product> searchCategory(Product product);
}
