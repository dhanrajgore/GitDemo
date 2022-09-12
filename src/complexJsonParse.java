import files.payload;
import io.restassured.path.json.JsonPath;

public class complexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JsonPath js = new JsonPath(payload.CoursePrice());
		
		// print no. of courses 
		
		int count = js.getInt("courses.size()");
		System.out.println(count);
		
		// print total purchase amount 
		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseAmount);
		
		// print titlle of first course
		
		String titleFirstCourse = js.get("courses[0].title");
		System.out.println(titleFirstCourse);
		
		// print all courses titles and its price 
		for (int i = 0; i < count; i++)
		{
			
			String courseTitles = js.get("courses["+i+"].title");
			System.out.println(js.get("courses["+i+"].price").toString());
			System.out.println(courseTitles);
			
		}
		
		
		// print no. of copies sold by RPA course
		
		System.out.println("Print No. Of copies sold by RPA course");
		
		for (int i = 0; i < count; i++)
		{
			
			String courseTitles = js.get("courses["+i+"].title");
			if (courseTitles.equalsIgnoreCase("RPA"))
			{
				int copiescount = js.get("courses["+i+"].copies");
				System.out.println(copiescount);
				break;
			}
			
			
		}
		
		
		
	}

}
