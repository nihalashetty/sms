package com.sms.controller;

import java.io.IOException;
import java.util.List;
import com.sms.model.Category;
import com.sms.model.Login;
import com.sms.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sms.service.ViewService;

@Controller
public class View {
	@Autowired
	ViewService viewService;

	@RequestMapping(value = "/usercat")
	public ModelAndView viewCatregoryUser(ModelAndView model) throws IOException {
		List<Category> cat = viewService.viewCategory();
		// model = new ModelAndView("fetchuser");
		model.addObject("cat", cat);
		model.setViewName("usercat");
		return model;

	}

	@RequestMapping(value = "/admincat")
	public ModelAndView viewCatregoryAdmin(ModelAndView model) throws IOException {
		List<Category> cat = viewService.viewCategory();
		model.addObject("cat", cat);
		model.setViewName("admincat");
		return model;

	}
	
	@RequestMapping(value = "/userproduct")
	public ModelAndView viewProductUser(ModelAndView model) throws IOException {
		List<Product> prod = viewService.viewProduct();
		model.addObject("prod", prod);
		model.setViewName("userproduct");
		return model;

	}
	
	@RequestMapping(value = "/adminproduct")
	public ModelAndView viewProductAdmin(ModelAndView model) throws IOException {
		List<Product> prod = viewService.viewProduct();
		model.addObject("prod", prod);
		model.setViewName("adminproduct");
		return model;

	}
}