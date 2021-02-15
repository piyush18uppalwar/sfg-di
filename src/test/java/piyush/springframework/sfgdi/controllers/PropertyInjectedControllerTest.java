package piyush.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import piyush.springframework.sfgdi.services.ConstructorInctedGreetingService;

class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		
		controller = new PropertyInjectedController();
		controller.greetinService = new ConstructorInctedGreetingService();
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
