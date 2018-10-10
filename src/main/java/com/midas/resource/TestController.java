package com.midas.resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/")
	public String testMethod(Model model) {
		System.out.println("Working");
		model.addAttribute("test", "test");
		return "Hello/Hai";
	}

}
