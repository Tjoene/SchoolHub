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
public class CourseController {
	@Autowired  
	CourseDAO courseDAO;
	
	@RequestMapping("/addCourse")  
	public ModelAndView addCourse() 
	{
		/*
		 * demo
		 */
		Course newC = courseDAO.CreateCourse("test_Course", "test_toeldo_id");
		System.out.println("added : "+newC.toString());
		
		return new ModelAndView("test");
		
	}
	@RequestMapping("/getCourse")  
	public ModelAndView getCourse() 
	{  
		/*
		 * demo
		 */
		Course getC = courseDAO.getCourseById(1);
		System.out.println("found : "+getC.toString());

		return new ModelAndView("test");
	}   
}  