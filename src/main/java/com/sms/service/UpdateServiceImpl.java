package com.sms.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sms.dao.UpdateDao;

import com.sms.model.Category;
import com.sms.model.Product;

public class UpdateServiceImpl implements UpdateService{
	@Autowired
	UpdateDao updateDao;
	@Override
	public void updateCat(Category category) {
		// TODO Auto-generated method stub
		updateDao.updateCat(category);
		
	}

	@Override
	public void updateProd(Product product) {
		// TODO Auto-generated method stub
		updateDao.updateProd(product);
	}

	@Override
	public void delProduct(Product product) {
		updateDao.delProduct(product);
	}

}
