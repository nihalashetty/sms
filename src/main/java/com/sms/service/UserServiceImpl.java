package com.sms.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sms.dao.UserDao;
import com.sms.model.Login;
import com.sms.model.User;

public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	public void register(User user){
		userDao.register(user);
	}
	public User validateUser(Login login){
		return userDao.validateUser(login);
	}
}
