package smoke;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class STest {

	@BeforeTest
	public void createDriver()
	{
		System.out.println("before TEst");
	}
	
	
	
	@Test
	public void loginTest()
	{
		System.out.println("in login test");
	}
}
