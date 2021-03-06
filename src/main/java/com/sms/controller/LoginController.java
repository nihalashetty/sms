
package com.sms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sms.model.Category;
import com.sms.model.Login;
import com.sms.model.User;
import com.sms.service.UserService;
import com.sms.service.ViewService;

@Controller
public class LoginController {
	@Autowired
	UserService userService;

	@Autowired
	ViewService viewService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login", new Login());
		
		return mav;
	}

	@SuppressWarnings("null")
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpSession session, HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") Login login) {
		ModelAndView mav = null;
		List<Category> cat = viewService.viewCategory();
		User user = userService.validateUser(login);
		if (login.getUsername().contains("admin-")) {
			if (user != null) {
				session.setAttribute("name", user.getUsername());
				mav = new ModelAndView("admin");
				mav.addObject("firstname", user.getUsername());
				mav.addObject("profit", viewService.getTotalProfit());
				mav.addObject("cat", cat);
			} else {
				mav = new ModelAndView("login");
				mav.addObject("message", "admin username or Password is wrong!!");
			}
		} else {
			if (user != null) {
				mav = new ModelAndView("welcome");
				mav.addObject("cat", cat);
				mav.addObject("firstname", user.getUsername());
			} else {
				mav = new ModelAndView("login");
				mav.addObject("message", "Username or Password is wrong!!");
			}
		}
		return mav;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		HttpSession session = request.getSession();
		session.invalidate();
		return mav;
	}
}
