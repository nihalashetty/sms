package com.sms.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sms.model.Category;
import com.sms.model.Product;
import com.sms.model.User;
import com.sms.service.UpdateService;


@Controller
public class UpdateItems {
	@Autowired
	UpdateService updateService;
	
	@RequestMapping(value = "/updatecat", method = RequestMethod.GET)
	  public ModelAndView showUpdateCat(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("updatecat");
	    mav.addObject("category", new Category());
	    return mav;
	  }
	
	
	@RequestMapping(value = "/updatecatprocess", method = RequestMethod.POST)
	public ModelAndView updateCatProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("category") Category category) throws IOException {
			updateService.updateCat(category);
			ModelAndView mav = null;
			return new ModelAndView("admin", "message","success");

	}
	
	
	
	
	
	@RequestMapping(value = "/updateprod", method = RequestMethod.GET)
	  public ModelAndView showUpdateProd(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("updateprod");
	    mav.addObject("product", new Product());
	    return mav;
	  }
	
	
	@RequestMapping(value = "/updateprodprocess", method = RequestMethod.POST)
	public ModelAndView updateProdProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("product") Product product) throws IOException {
			updateService.updateProd(product);
			ModelAndView mav = null;
			return new ModelAndView("admin", "message","success");

	}
}