package com.kutco.schoolhub.auth;

import org.springframework.stereotype.Controller;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthTest {

	@RequestMapping(value = { "/auth" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Test");
		model.addObject("message", "This is security test page!");
		model.setViewName("auth");
		return model;

	}

	@Secured("ROLE_USER")
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Test");
		model.addObject("message", "This is protected page - Admin Page!");
		model.setViewName("admin");

		return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error) {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Test");
		model.addObject("message", "This is protected page - Admin Page!");
		if (error != null) {
            model.addObject("error", "Invalid username and password!");
        }
		model.setViewName("login");

		return model;
	}
}