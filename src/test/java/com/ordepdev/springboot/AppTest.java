package com.ordepdev.springboot;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.ordepdev.springboot.controller.HomeController;


public class AppTest {
	
	@Test
	public void testApp() {
		HomeController controller = new HomeController();
		
		String result = controller.home();
		
		assertEquals("Booting...", result);
	}
}
