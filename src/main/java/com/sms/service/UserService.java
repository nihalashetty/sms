package com.sms.service;
import com.sms.model.*;


public interface UserService {
	void register(User user);
	User validateUser(Login login);
}
