package com.kutco.schoolhub.auth;

import org.springframework.stereotype.Controller;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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

	@Secured("ROLE_ADMIN")
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Test");
		model.addObject("message", "This is protected page - Admin Page!");
		model.setViewName("admin");

		//Get the username of the currently logged in user.
		Authentication auth = SecurityContextHolder.getContext()
				.getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails userDetails = (UserDetails) auth.getPrincipal();
			String username = userDetails.getUsername();
			System.out.println("Welcome user " + username);
		}

		return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
			@RequestParam(value = "error", required = false) String error) {
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}
		model.setViewName("login");

		return model;
	}

	@RequestMapping(value = "/logoutSuccess", method = RequestMethod.GET)
	public ModelAndView logout() {
		ModelAndView model = new ModelAndView();
		model.setViewName("logout");

		return model;
	}
}