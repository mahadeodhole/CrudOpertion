package customer_controllerCRUDoperation;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;


@Test
public class Customer_GetWithPhone {

	
	public void customer_GetWithPhone () {
		baseURI="http://localhost:8080";
 	given() 
	//.queryParam("phone","8986734899");	
	 .contentType(ContentType.JSON)
		
		  .when()
		 .get("customers?phone=8986734899")
		 .then().assertThat()
		.contentType("application/xml")
		 .statusCode(200)
		 
		 .log().all();
		
		
		
		
}
}
