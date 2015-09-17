package com.example.tests;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import com.example.fw.User;

public class SigneupTest extends TestBase {
	
	@Test
	public void newUserShouldSignup() {
		User user = new User().setLogin("testuser1")
				.setEmail("testuser1@localhost")
				.setPassword("123456");
		app.getAccountHelper().signUp(user);
		assertTrue(app.getAccountHelper().isLogged(user));
	}
	

}
