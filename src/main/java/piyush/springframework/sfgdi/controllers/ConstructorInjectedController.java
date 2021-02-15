package piyush.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import piyush.springframework.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	
	private GreetingService greetingService;

	@Autowired // Optional in case of construcor injector
	public ConstructorInjectedController(@Qualifier("constructorInctedGreetingService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
	

}
