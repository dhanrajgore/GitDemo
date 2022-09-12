package files;

public class payload {
	
	public static String Addplace()
	{
		
		return "{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Rahul Shetty Academy\",\r\n" + 
				"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
				"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"shoe park\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://rahulshettyacademy.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}\r\n" + 
				"";
		
	}

	
	public static String CoursePrice() 
	{
		
		return ("{\r\n"
				+ "\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\r\n"
				+ "\"purchaseAmount\": 1162,\r\n"
				+ "\r\n"
				+ "\"website\": \"rahulshettyacademy.com\"\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "\"courses\": [\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Selenium Python\",\r\n"
				+ "\r\n"
				+ "\"price\": 50,\r\n"
				+ "\r\n"
				+ "\"copies\": 6\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Cypress\",\r\n"
				+ "\r\n"
				+ "\"price\": 40,\r\n"
				+ "\r\n"
				+ "\"copies\": 4\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"RPA\",\r\n"
				+ "\r\n"
				+ "\"price\": 45,\r\n"
				+ "\r\n"
				+ "\"copies\": 10\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Appium\",\r\n"
				+ "\r\n"
				+ "\"price\": 36,\r\n"
				+ "\r\n"
				+ "\"copies\": 7\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "]\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "");
		
	}
	
	public static String xmlParse()
	{
		return("<bookstore>\r\n"
				+ "<book category=\"cooking\" test=\"passed\">\r\n"
				+ "<title lang=\"en\">The Nightingale</title>\r\n"
				+ "<author>Hannah</author>\r\n"
				+ "<year>2015</year>\r\n"
				+ "<price>\r\n"
				+ "<paperback>200</paperback>\r\n"
				+ "<hardcover>570</hardcover>\r\n"
				+ "</price>\r\n"
				+ "</book>\r\n"
				+ "<book category=\"children\">\r\n"
				+ "<title lang=\"en\">Harry Potter</title>\r\n"
				+ "<author>J K. Rowling</author>\r\n"
				+ "<year>2005</year>\r\n"
				+ "<price>29.99</price>\r\n"
				+ "</book>\r\n"
				+ "</bookstore>");
	}
	
	
	public static String addBook(String isbn, String aisle) 
	{
		String payload = "{ \r\n"
				+ "\"name\":\"Learn Appium Automation with Java\", \r\n"
				+ "\r\n"
				+ "\"isbn\":\""+isbn+"\", \r\n"
				+ "\r\n"
				+ "\"aisle\":\""+aisle+"\", \r\n"
				+ "\r\n"
				+ "\"author\":\"John foe\" \r\n"
				+ "}";
		
				return payload;
		
	}

}

	


