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
import com.kutco.schoolhub.models.*;
   
@Controller  
public class CourseGroupController {
	@Autowired  
	CourseGroupDAO courseGroupDAO;
	
	@RequestMapping("/addCourseGroup")  
	public ModelAndView addCourseGroup() 
	{
		/*
		 * demo
		 */
		CourseGroup newCg = courseGroupDAO.CreateCourseGRoup("test_CourseGroup");
		System.out.println("added : "+newCg.toString());
		return new ModelAndView("test");
		
	}
	@RequestMapping("/getCourseGroup")  
	public ModelAndView getCourseGroup() 
	{  
		/*
		 * demo
		 */
		CourseGroup getCg = courseGroupDAO.getCourseGroupById(1);
		System.out.println("found : "+getCg.toString());
		return new ModelAndView("test");
		
	}   
}  