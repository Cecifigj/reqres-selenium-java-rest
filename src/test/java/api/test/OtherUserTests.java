
package api.test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.InputStream;

import org.junit.Before;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import api.endpoints.Routes;


import api.endpoints.UserEndPoints;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseOptions;
import io.restassured.specification.RequestSpecification;

import org.junit.Test;

import com.aventstack.extentreports.gherkin.model.Given;
import com.fasterxml.jackson.databind.JsonNode;

public class OtherUserTests {
	
	private Object u;
	private ValidatableResponse name;

	@Before
	public void setup() {
		RestAssured.baseURI="https://reqres.in/api";
	}
	
	@Test
	public void getAllUsers() {
		given().
		when().get("/users?page=2").
		then().
		statusCode(200); 
	}
	
	@Test
	public void getOneUserByID() {
		given().
		when().get("/users/23").
		then().statusCode(401);
	}
	
	@Test
	public void getAllUserNames() {
		given().
		when().get("/users?page=2").

		then().assertThat().body("data.email", hasItem("michael.lawson@reqres.in")).and().body("data.first_name",hasItem("Michael"));
	}
	
	

}