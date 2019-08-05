package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sms.dao.ViewDao;
import com.sms.model.Category;

public class ViewServiceImpl implements ViewService{
	@Autowired
	ViewDao viewDao;
	
	
	@Override
	public List<Category> viewCategory() {
		return viewDao.getAllCategory();
		
	}

	@Override
	public List<Category> viewProducts() {
		return viewDao.getAllProducts();
		
	}

}
