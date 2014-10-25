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
import com.kutco.schoolhub.dao.*;
   
@Controller  
public class CourseResourceController {
	@Autowired  
	CourseResourceDAO courseResourceDAO; 
	 
	@RequestMapping("/addCourseResource")  
	public ModelAndView addCourseResource() 
	{  
		courseResourceDAO.CreateRescource("test");
		return new ModelAndView("addedCourseResource");
	}   
}  