package com.sms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sms.model.Category;
import com.sms.model.Order;
import com.sms.model.Product;
import com.sms.model.User;
import com.sms.service.UpdateService;
import com.sms.service.ViewService;

@Controller
public class UpdateItems {
	@Autowired
	UpdateService updateService;
	@Autowired
	ViewService viewService;

	@RequestMapping(value = "/updatecat", method = RequestMethod.GET)
	public ModelAndView showUpdateCat(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		List<Category> cat = viewService.viewCategory();
		mav.addObject("cat", cat);
		mav.setViewName("updatecat");
		return mav;
	}

	@RequestMapping(value = "/updatecatprocess", method = RequestMethod.POST)
	public void updateCatProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("category") Category category) throws IOException {
		updateService.updateCat(category);


	}

	@RequestMapping(value = "/updateprod", method = RequestMethod.GET)
	public ModelAndView showUpdateProd(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		List<Category> cat = viewService.viewCategory();
		mav.addObject("cat", cat);
		mav.setViewName("updateproduct");
		return mav;
	}

	@RequestMapping(value = "/updateprodprocess", method = RequestMethod.POST)
	public void updateProdProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("product") Product product) throws IOException {
		updateService.updateProd(product);


	}
	
	@RequestMapping(value = "/delproduct", method = RequestMethod.POST)
	public void delProductProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("product") Product product) throws IOException{
			updateService.delProduct(product);
	}
	
	@RequestMapping(value = "/dispatch", method = RequestMethod.POST)
	public void dispatchProduct(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("order") Order order) throws IOException {
			updateService.dispatchProduct(order);

	}
}