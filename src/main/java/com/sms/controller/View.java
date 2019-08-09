package com.sms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.model.Category;
import com.sms.model.Login;
import com.sms.model.Order;
import com.sms.model.Product;
import com.sms.model.Supplier;
import com.sms.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sms.service.ViewService;

@Controller
public class View {
	@Autowired
	ViewService viewService;
	
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView showAdmin(HttpServletRequest request, HttpServletResponse response) {
		List<Category> cat = viewService.viewCategory();
		ModelAndView mav = null;
		mav.addObject("cat", cat);
		mav.setViewName("admin");
		return mav;
	}
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
	
	@RequestMapping(value = "/customers")
	public ModelAndView viewCustomers(ModelAndView model) throws IOException {
		List<User> cust = viewService.viewCustomer();
		model.addObject("cust", cust);
		model.setViewName("customers");
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
	
	@RequestMapping(value = "/searchcategory")
	public ModelAndView searchCat(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("product") Product product) throws IOException {
		List<Product> cat = viewService.searchCategory(product);
		ModelAndView mav = new ModelAndView();
		mav.addObject("searchedcat",cat);
		mav.setViewName("searchedcat");
		return mav;

	}
	
	@RequestMapping(value = "/pendingorders")
	public ModelAndView viewPendingOrder(ModelAndView model) throws IOException {
		List<Order> ord = viewService.viewPendingOrders();
		List<Supplier> sup = viewService.viewSuppliers();
		model.addObject("sup", sup);
		model.addObject("ord", ord );
		model.setViewName("pendingorder");
		return model;

	}
	
	@RequestMapping(value = "/dispatchedorders")
	public ModelAndView viewDispatchedOrder(ModelAndView model) throws IOException {
		List<Order> ord = viewService.viewDispatchedOrders();
		model.addObject("ord", ord );
		model.setViewName("dispatchedorders");
		return model;

	}
	
	
	@RequestMapping(value = "/viewsuppliers")
	public ModelAndView viewSupplier(ModelAndView model) throws IOException {
		List<Supplier> supp = viewService.viewSuppliers();
		model.addObject("supp", supp );
		model.setViewName("suppliers");
		return model;

	}
	
}