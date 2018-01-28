package org.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer",new Customer());
		
		return "customer-form";
	}

	//add a pre-processor for all web-requests coming to the controller
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		//removes all leading and trailing whitespace for all String form data
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		//true means if the string is all white space, trim to null
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, 
			BindingResult bindingResult){
		//results of validation will be placed in this object 
		System.out.println("Last Name: | " + customer.getLastName() + "|");
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}else {
			return "customer-confirmation";
		}
		
	}
}
