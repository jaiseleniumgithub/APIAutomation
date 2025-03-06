package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.Request.SignupRequest;

import io.restassured.response.Response;

public class SignupAPItest {
	@Test (description = "verify if signup is working")
	public void singup() {
		// SignupRequest signupRequest = new SignupRequest(null, null, null, null, null,
		// null);
		SignupRequest signupRequest = new SignupRequest.Builder().username("1test1234").password("1test1234")
				.firstName("1test4").lastName("1234test").email("test1234@amail.com").mobileNumber("9898979882").build();

		AuthService authservice = new AuthService();
		Response response = authservice.Signup(signupRequest);
		System.out.println(response.asPrettyString());
	}

}
