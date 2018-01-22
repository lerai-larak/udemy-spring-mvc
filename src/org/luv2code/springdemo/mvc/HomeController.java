package org.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //this annotation extends @Component
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
}
