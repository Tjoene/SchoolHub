package com.kutco.schoolhub;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap model) {
		model.addAttribute("message", "It's a live!"); // fill in the message on
													   // the jsp page

		return "index"; // This is the view that needs to be used
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");

		return "hello";
	}

}