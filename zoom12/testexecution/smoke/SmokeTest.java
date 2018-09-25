package smoke;

import org.testng.annotations.Test;

import locators.Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pom.Login;
import zoom12.BrowserFactory;
import zoom12.TestData;

public class SmokeTest {

	WebDriver driver;


	
	@BeforeTest
	public void createDriver() {
		System.out.println("BEFORE TEST");
		TestData d = new TestData();
		d.readExcelData();
		driver = BrowserFactory.createBrowser("chrome");

	}

	@BeforeMethod
	public void t() {
		System.out.println("before test execution");
	}

	
	
	@Test
	public void LoginTest() {
		Login.ValidLogin(driver);
		if (driver.getCurrentUrl().equalsIgnoreCase(Locator.DASHBOARD_URL)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Refreshing page");
			driver.navigate().refresh();
			Login.ValidLogin(driver);

		}

		if (driver.getCurrentUrl().equalsIgnoreCase(Locator.DASHBOARD_URL)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}

		// @FindBy(xpath)

	}

	@AfterTest
	public void destroy() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
