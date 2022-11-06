package customer_controllerCRUDoperation;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Customer_GetWithEmail {
	@Test

	public void GetWithEmail() {
		baseURI="http://localhost:8080";
		given().contentType(ContentType.JSON)
		.when()
		.get("/customers/email/mahadeodhole000@gnail.com")
		.then()
		.assertThat()
		//.contentType("application/json")
		.statusCode(200)
		.log() .all();
		
		
	}

}
