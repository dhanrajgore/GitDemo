import java.util.List;

import org.testng.annotations.Test;

import files.payload;
import io.restassured.path.xml.XmlPath;

public class XMLRead {
	
	@Test
	
	
	public void XMLParse()
	{
		
		XmlPath x1 = new XmlPath(payload.xmlParse());
		List<Object> count = x1.getList("bookstore.size()");
		
		
	
		System.out.println(count);
		
	}
	

}
