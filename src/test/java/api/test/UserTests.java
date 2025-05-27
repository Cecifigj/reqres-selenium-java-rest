package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

//import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import io.restassured.response.Response;

public class UserTests {

	@Test(priority=1)
	public void testGetAllUsers()
	{
		Response response=UserEndPoints.readUser();
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	public void testGetOneUser()
	{
		Response response=UserEndPoints.readOneUser(7);
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	

}
