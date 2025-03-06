package com.api.base;

import com.api.models.Request.UpdateUserRequest;

import io.restassured.response.Response;

public class UserProfileManagementService extends Baseservice {

	private static String BASE_PATH ="/api/users/";
	
	public Response getProfile(String token) {
		setToken(token);
		return getRequest(BASE_PATH+"profile");
	}
	
	public Response updateProfile(String token, UpdateUserRequest payload) {
		setToken(token);
		return putRequest(payload, BASE_PATH+"profile"); 
	}
	
}
	
