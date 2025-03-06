package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.Request.LoginRequest;
import com.api.models.Request.UpdateUserRequest;
import com.api.models.Response.LoginResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {
@Test
	public void updateprofileTest() {
	
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("jaitest123", "jaitest123"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println("Loginresponse"+response.asPrettyString());
		
		
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		System.out.println("UserDetailsResonse"+ response.asPrettyString());
		
		UpdateUserRequest updateUserRequest = new UpdateUserRequest.UserDetailsBuilder().setEmail("aee@gmail.com").setFirstName("Jay").setFirstName("shan").setMobileNumber("123223434").build();
		
		response = userProfileManagementService.updateProfile(loginResponse.getToken(), updateUserRequest);
		System.out.println("UpdateDetailsResonse"+response.asPrettyString());
	}
}
