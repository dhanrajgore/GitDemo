package files;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DynamicJson {
	
	
	@Test(dataProvider="BooksData")
	
	public void addBook(String isbn, String aisle) {
		
		RestAssured.baseURI="http://216.10.245.166";
		String response =given().log().all().header("content-type","application/json").
		body(payload.addBook(isbn,aisle))
		.when().post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		JsonPath js = ReUsableMethod.rawToJson(response);
		
		String id = js.get("ID");
		System.out.println(id);
		
	}
	
	@DataProvider(name="BooksData")
public Object[][] getData()
	{
		// array - collection of elements
		// multidimensional array - collection of arrays
		return new Object[][] {{"aaaa","3432444"},{"bbbbb","767676"},{"hhhhh","785555"}};
		
		
		
	}
	}
