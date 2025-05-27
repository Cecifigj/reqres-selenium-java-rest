package api.endpoints;

public class Routes {
	public static String base_url="https://reqres.in/api";
	
	//GET LIST OF USERS
	public static String get_url=base_url+"/users?page=2";
	//GET 1 USER valid =2; invalid =499
	public static String get_single_user=base_url+"/users/{username}";

	
	//POST
	
	//PUT-PATCH
	
	//DELETE

}
