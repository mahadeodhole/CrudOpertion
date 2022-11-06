package Authorization;
import static io.restassured.RestAssured.*;
public class GetAuthorization {
	public static void main(String[]args) {
		baseURI="https://github.com";
		
		given().auth().basic("mahadeodhole000@gmail.com","dhole@000.")
		.when().get("/login")
		.then().log().all();
	}

}
