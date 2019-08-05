package com.sms.dao;


import com.sms.model.Login;
import com.sms.model.User;
public interface UserDao {
  void register(User user);
  User validateUser(Login login);
}