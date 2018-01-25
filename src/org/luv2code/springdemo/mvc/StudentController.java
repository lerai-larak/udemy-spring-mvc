package org.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		//create a new student object
		Student student = new Student();
		
		//add student to model
		theModel.addAttribute("student",student);
		return "student-form";
		
	}
	
//	process the submitted form
	@RequestMapping("/processForm")
	public String processStudentForm(@ModelAttribute("student") Student theStudent){
		//the annotation will cause the model attribute to be forwarded to the confirm page
		System.out.println("The student: " + theStudent.getFirstName() + "  " + theStudent.getLastName());
		return "student-confirmation";
		
	}
}
