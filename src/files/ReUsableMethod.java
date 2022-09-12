package files;

import io.restassured.path.json.JsonPath;

public class ReUsableMethod {

	
	public static JsonPath rawToJson(String responses)
	
	{
		
		JsonPath js1 = new JsonPath(responses);
		
		return js1;
		
		
	}
}
