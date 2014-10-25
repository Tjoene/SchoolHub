package com.kutco.schoolhub.validators;
  
import org.springframework.validation.Errors;  
import org.springframework.validation.Validator;  

import com.kutco.schoolhub.models.UploadedFile;
      
 public class FileValidator implements Validator {  
	@Override  
	public void validate(Object uploadedFile, Errors errors) {  
	 
		UploadedFile file = (UploadedFile) uploadedFile;  
	  
		if (file.getFile().getSize() == 0) {  
			errors.rejectValue("file", "uploadForm.salectFile",  
					"Please select a file!");  
		}  
	 
	}
	
	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}  
  
}  