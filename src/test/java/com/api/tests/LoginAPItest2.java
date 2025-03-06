package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.Request.LoginRequest;
import com.api.models.Response.LoginResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.Testlisteners.class)
public class LoginAPItest2 {

	@Test
	public void loginTest() {
		// TODO Auto-generated method stub
		LoginRequest loginRequest = new LoginRequest("jaitest123", "jaitest123");

		AuthService Auth = new AuthService();
		Response Response = Auth.login(loginRequest);
		System.out.println(Response.asPrettyString());
		
		LoginResponse loginResponse = Response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());
			
		Assert.assertEquals(loginResponse.getId(), 197);
	}

}
