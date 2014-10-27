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
public class StudentController {
	@Autowired  
	StudentDAO studentDAO;
	
	@RequestMapping("/addStudent")  
	public ModelAndView addStudent() 
	{
		/*
		 * demo
		 */
		Student addedStudent = studentDAO.CreateStudent("test_first_name", "test_last_name","test_nickname", "testPass", "testRole");
		System.out.println("added test User with name="+addedStudent.getFirstName()+" "+addedStudent.getLastName());
		return new ModelAndView("addedStudent");
	}
	@RequestMapping("/getStudent")  
	public ModelAndView getStudent() 
	{  
		/*
		 * demo
		 */
		Student testStudent = studentDAO.getStudentById(1);
		System.out.println("by id: "+testStudent.toString());
		testStudent = studentDAO.getStudentByNickname("test_nickname");
		System.out.println("by nick: "+testStudent.toString());
		return new ModelAndView("test");
	}   
}  