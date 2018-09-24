package smoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import locators.Locator;
import zoom12.TestData;

public class SmokeTest {

	@BeforeSuite
	public void createDriver() {
		System.out.println("BEFOR SUIT");
		TestData d= new TestData();
		d.readExcelData();
	}

	@Test
	public void LoginTest() {
		WebDriver driver = new FirefoxDriver();
		driver.get(Locator.DASHBOARD_URL);
		try {
			Thread.sleep(10000);

			driver.findElement(By.xpath(Locator.USERNAME_XPATH)).sendKeys(TestData.USERNAME);
			driver.findElement(By.xpath(Locator.PASSWORD_XPATH)).sendKeys(TestData.PASSWORD);
			driver.findElement(By.xpath(Locator.LOGINBUTTON_XPATH)).click();
			driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// @FindBy(xpath)

	}

	public void destroy() {
		// driver.close();
	}

}
