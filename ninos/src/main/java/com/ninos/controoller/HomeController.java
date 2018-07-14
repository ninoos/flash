package com.ninos.controoller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	
	public String home() {
		return "index";
	}

}
