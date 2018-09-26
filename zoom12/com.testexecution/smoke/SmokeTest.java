package smoke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import locators.Locator;
import pom.Login;
import zoom12.BrowserFactory;
import zoom12.TestData;

public class SmokeTest {

	WebDriver driver;
	TestData data;
	Login login;
	boolean flag = true;

	@BeforeTest
	public void createDriver() {
		data = new TestData();
		flag = data.readExcelData();
		Assert.assertTrue(flag, "Unable to read file");
		driver = BrowserFactory.createBrowser("chrome");

	}

	@Test
	void test() {
		login = new Login(driver);
		login.ValidLogin(data);

		if (driver.getCurrentUrl().equalsIgnoreCase(Locator.DASHBOARD_URL)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Refreshing page");
			driver.navigate().refresh();
			login.ValidLogin(data);
			if (driver.getCurrentUrl().equalsIgnoreCase(Locator.DASHBOARD_URL)) {
				System.out.println("Test Pass");

			} else {
				System.out.println("Test Failed");
				flag = false;
			}

		}

	}

	@AfterTest
	public void destroy() throws InterruptedException {
		Thread.sleep(60000);
		driver.close();
	}

}
