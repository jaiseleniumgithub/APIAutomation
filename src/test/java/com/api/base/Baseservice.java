package com.api.base;

import static io.restassured.RestAssured.given;

import com.api.models.Request.LoginRequest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Baseservice { // wrapper for RA

	private static String BASE_URL = "http://64.227.160.186:8080";
	private RequestSpecification requestSpecification;
// constructor to initialize
	public Baseservice() {
		requestSpecification = given().baseUri(BASE_URL);
	}
	
	protected void setToken(String token) {
		requestSpecification.header("Authorization", "Bearer "+token);
	}
//postmethod
	protected Response postRequest(Object login, String endoint) {
		return requestSpecification.contentType(ContentType.JSON).body(login).post(endoint);
	}
	
	protected Response getRequest(String endoint) {
		return requestSpecification.get(endoint);
	}
	
	protected Response putRequest(Object login, String endoint) {
		return requestSpecification.contentType(ContentType.JSON).body(login).put(endoint);
	}


}
