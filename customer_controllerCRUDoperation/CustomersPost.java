package customer_controllerCRUDoperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class CustomersPost {
	
@Test
public void costumer_post() {
		
		
		baseURI="http://localhost:8080";
		JSONObject object=new JSONObject();
		object.put("dob", "1698-06-26");
		object.put("email", "wyeuoahdiuukli@gmail.com");
		object.put("id",134);
		object.put("name", "maha");
		object.put("phone", "8493970987");
		
		
		given()
		.contentType(ContentType.JSON)
		.body(object)
		.when()
		.post("/customers")
		.then()
		.log().all()
		.assertThat().statusCode(201);

}
}
