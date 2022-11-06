package Authorization;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class PostAuthenticationToken {
	
	public static void main(String[]args) {
		baseURI="https://api.github.com";
		
		JSONObject obj=new JSONObject();
		obj.put("name", "VenueGenieSprint2");
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
	}

}
