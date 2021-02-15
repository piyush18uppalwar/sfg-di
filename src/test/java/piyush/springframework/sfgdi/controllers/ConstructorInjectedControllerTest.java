package piyush.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import piyush.springframework.sfgdi.services.ConstructorInctedGreetingService;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		controller = new ConstructorInjectedController(new ConstructorInctedGreetingService());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
