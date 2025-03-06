package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;

public class LoginAPItest {
	@Test
	
	public void main(String[] args) {		
		
		Response Response = given()
				.baseUri(baseURI="http://64.227.160.186:8080")
				.header("Content-Type","application/json")
				.body("{ \"username\": \"jaitest123\", \"password\": \"jaitest123\" }")
				.post("/api/auth/login");
		System.out.println(Response.asPrettyString());
		Assert.assertEquals(Response.getStatusCode(), 200);
	}

}
