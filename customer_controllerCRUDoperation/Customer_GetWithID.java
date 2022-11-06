package customer_controllerCRUDoperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

  
public class Customer_GetWithID {
	
	 @Test

	public void GetWithID() {
		baseURI="http://localhost:8080";
		//port=8080;
	//	String id = "125";
		given()
	//	.pathParam("id", "125")
		.contentType(ContentType.JSON)
		.when()
		.get("/customers/159")
		.then()
		.assertThat()
	   // .contentType(ContentType.JSON)
		.statusCode(200)
		.log().all();

}}
