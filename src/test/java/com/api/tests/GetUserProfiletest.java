package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.Request.LoginRequest;
import com.api.models.Response.LoginResponse;
import com.api.models.Response.UserProfileResponse;

import io.restassured.response.Response;

public class GetUserProfiletest {
@Test
	public void getProfileInfo(){	
		//Token
		AuthService authservice = new AuthService();
		Response response = authservice.login(new LoginRequest("jaitest123", "jaitest123"));
		LoginResponse LoginResponse = response.as(LoginResponse.class);
		System.out.println(LoginResponse.getToken());
		
		//getuserprofile   
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		response = userProfileManagementService.getProfile(LoginResponse.getToken());
		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		System.out.println(userProfileResponse.getMobileNumber());
	}
}
