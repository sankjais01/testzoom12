package smoke;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import locators.Locator;
import pom.Login;
import zoom12.TestData;

public class SmokeTest {

	
	WebDriver driver=null;
	@BeforeTest
	public void createDriver() {
		System.out.println("BEFOR TEST");
		TestData d = new TestData();
		d.readExcelData();
		driver = new FirefoxDriver();
	}

	@Test
	public void LoginTest() {
		Login.ValidLogin(driver);

		// @FindBy(xpath)

	}

	/*public void destroy() {
		// driver.close();
	}*/

	
	
	
}
