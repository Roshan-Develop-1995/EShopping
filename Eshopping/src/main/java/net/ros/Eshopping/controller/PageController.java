package net.ros.Eshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value= "/home")
	public ModelAndView index() {
		
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("greeting", "Welcome to Spring MVC");
		return mav;
	}
	
	@RequestMapping(value="/testing")
	public ModelAndView testing(@RequestParam(value = "greeting",required = false)String greeting ) {
		if(greeting == null)
			greeting= "Hello there";
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("greeting", greeting);
		return mav;
	}
	
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greeting ) {
		if(greeting == null)
			greeting= "Hello there";
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("greeting", greeting);
		return mav;
	}

}
