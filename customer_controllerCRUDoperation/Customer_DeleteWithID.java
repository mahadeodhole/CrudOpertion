package customer_controllerCRUDoperation;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Customer_DeleteWithID {
	@Test
	public void DeleteWithID() {
		baseURI="http://localhost:8080";
		given().contentType(ContentType.JSON)
		.when()
		.get("/customers/159")
		.then()
		.assertThat().statusCode(200)
		.log().all();

}}
