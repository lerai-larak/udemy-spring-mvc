package org.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{programmingLanguages}") //read values from properties file
	private LinkedHashMap <String,String> programmingLanguages;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		//create a new student object
		Student student = new Student();
		
		//add student to model
		theModel.addAttribute("student",student);
		
		//add prg lang options to model
		theModel.addAttribute("pLangOptions",programmingLanguages);
		return "student-form";
		
	}
	
//	process the submitted form
	@RequestMapping("/processForm")
	public String processStudentForm(@ModelAttribute("student") Student theStudent){
		//the annotation will cause the model attribute to be forwarded to the confirm page
		System.out.println("The student: " + theStudent.getFirstName() + "  " + theStudent.getLastName() + "country: " + theStudent.getCountry());
		return "student-confirmation";
		
	}
}
