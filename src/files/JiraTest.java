package files;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

public class JiraTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI ="http://localhost:8080/";
		// login 
SessionFilter session = new SessionFilter();


String response = given().header("content-type","application/json").body("{ \"username\": \"dhanraj.gore1\", \"password\": \"Dhanraj@123\" }")
.log().all().when().post("/rest/auth/1/session").then().extract().asString();
		
		given().pathParam("id", "10004").log().all().body("{\r\n"
				+ "    \"body\": \"First Comment\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}").when().post("/rest/api/2/issue/{id}/comment");

	}

}
