
package com.sms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.sms.model.Login;
import com.sms.model.User;
import com.sms.service.UserService;

@Controller
public class LoginController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login", new Login());
		return mav;
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") Login login) {
		ModelAndView mav = null;
		User user = userService.validateUser(login);
		if(login.getUsername().contains("admin-")){
			if (user != null) {
				mav = new ModelAndView("admin");
				mav.addObject("firstname", user.getUsername());
			} else {
				mav = new ModelAndView("login");
				mav.addObject("message", "admin username or Password is wrong!!");
			}
		}else{
		if (user != null) {
			mav = new ModelAndView("welcome");
			mav.addObject("firstname", user.getUsername());
		} else {
			mav = new ModelAndView("login");
				mav.addObject("message", "Username or Password is wrong!!");
			}
		}
		return mav;
	}
}