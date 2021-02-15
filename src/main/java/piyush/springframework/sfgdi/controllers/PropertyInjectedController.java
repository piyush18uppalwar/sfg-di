package piyush.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import piyush.springframework.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Qualifier("propertyInjectedGreetingService")
	@Autowired
	public GreetingService greetinService;
	
	public String getGreeting() {
		return greetinService.sayGreeting();
	}
	
}
