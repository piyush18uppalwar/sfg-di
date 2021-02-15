package piyush.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

import piyush.springframework.sfgdi.services.GreetingService;

@Controller
public class MyController {
	
	
	private final GreetingService greetingService ;
	
	@Autowired
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
	

}
