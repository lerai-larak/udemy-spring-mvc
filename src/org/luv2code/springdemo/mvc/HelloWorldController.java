package org.luv2code.springdemo.mvc;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") 
//remove ambiguity on request mapping "processForm" also present in SillyController, this makes 
//all mapping in this class relative to /hello/
public class HelloWorldController {

	//controller method to show the initial html form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//controller method to process the html fmorm
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormv2")
	public String doShoutOut(HttpServletRequest request, Model model) {
		//read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		//convert the data to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hi " +  theName;
		
		//add the message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	//getting form parameters using @RequestParam annotation
	@RequestMapping("/processFormv3")
	public String doSomeShoutOut(@RequestParam("studentName") String theName, Model model) {
		
		//convert the data to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "This is a welcome message from v3, Hi: " +  theName;
		
		//add the message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
