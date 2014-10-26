package com.kutco.schoolhub.controllers; 
  
import java.io.File;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.OutputStream;  
  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.validation.BindingResult;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.multipart.MultipartFile;  
import org.springframework.web.servlet.ModelAndView;  

import com.kutco.schoolhub.validators.FileValidator;
import com.kutco.schoolhub.DAO.*;
   
/*
 * simple controller demonstrating a new bug the auth system
 */
@Controller  
public class TestController {
	 
	@RequestMapping("/test")  
	public ModelAndView test() 
	{  
		return new ModelAndView("test");
	}   
}  