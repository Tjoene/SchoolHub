package com.kutco.schoolhub.controllers; 
  
import com.kutco.schoolhub.models.*;
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
   
@Controller  
public class CourseResourceController {
	@Autowired  
	CourseResourceDAO courseResourceDAO; 
	 
	@RequestMapping("/addCourseResource")  
	public ModelAndView addCourseResource() 
	{  
		CourseResource crAdd = courseResourceDAO.CreateRescource("test");
		System.out.println("added: "+crAdd.toString());
		return new ModelAndView("addedCourseResource");
	}
	@RequestMapping("/getCourseResource")  
	public ModelAndView getCourseResource() 
	{  
		CourseResource crGet = courseResourceDAO.getCourceResourseById(1);
		System.out.println("added: "+crGet.toString());
		return new ModelAndView("addedCourseResource");
	}
}  