package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String sayHello() {
		// return "index";
		return "Login";
	}

	@RequestMapping("/test")
	public String gettest(Model model) {
		model.addAttribute("m1", "This is msg via m1");
		model.addAttribute("m2", "This is msg via m2");
		return "testmodel";
	}

	// @RequestMapping(value="/hello",method=RequestMethod.GET)
	@GetMapping("/hello")
	public ModelAndView getMessage() {
		String msg = "Hello from getMessage";
		return new ModelAndView("greet", "message", msg);
	}
}
