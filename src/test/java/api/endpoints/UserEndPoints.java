package api.endpoints;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

//UserEndPoints.java -> CRUD operations in the user API
public class UserEndPoints {
	public static Response readUser()
	{
		Response response=given()
				
		.when()
			.get(Routes.get_url);
		return response;
				
	}
	

	public static Response readOneUser(int id)
		{
			Response response=given()
					.pathParam("id", id)
					
			.when()
				.get(Routes.get_single_user);
			return response;
					
		}	

}
