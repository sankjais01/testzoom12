package smoke;

import org.testng.annotations.Test;

import locators.Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pom.Login;
import zoom12.BrowserFactory;
import zoom12.TestData;

public class SmokeTest {

	WebDriver driver;
	TestData data = new TestData();
	Login login;

	@BeforeTest
	public void createDriver() {
		System.out.println("");
		TestData data = new TestData();
		data.readExcelData();
		driver = BrowserFactory.createBrowser("chrome");
		//driver.get(Locator.LOGIN_URL);

	}

	

	@Test
	void test() {
		login = new Login(driver);
		login.ValidLogin(data);

		Assert.assertEquals(Locator.DASHBOARD_URL, driver.getCurrentUrl());
		if (driver.getCurrentUrl().equalsIgnoreCase(Locator.DASHBOARD_URL)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Refreshing page");
			driver.navigate().refresh();
			login.ValidLogin(data);
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
