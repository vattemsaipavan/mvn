package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCController {

	@RequestMapping("/hello")
	public ModelAndView Sayhello() {
		ModelAndView mvc = new ModelAndView("home");
		mvc.addObject("message", "Greeting message from controller");
		System.out.println("/hello endpoint is called");
		return mvc;
	}
}
