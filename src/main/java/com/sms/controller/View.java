package com.sms.controller;



import java.io.IOException;
import java.util.List;
import com.sms.model.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sms.service.ViewService;


@Controller
public class View{
	@Autowired
	ViewService viewService;
	
	@RequestMapping(value = "/fetch")
	public ModelAndView viewCatregory(ModelAndView model)throws IOException{
		List<Category> cat = viewService.viewCategory();
		model.addObject("cat", cat);
		model.setViewName("welcome");
		return model;
		
	}
	
}