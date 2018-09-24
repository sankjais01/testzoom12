package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import locators.Locator;
import zoom12.TestData;

public class Login {

	public void ValidEmail() {

	}

	public static void ValidLogin(WebDriver driver) {
		

		driver.get(Locator.DASHBOARD_URL);
		try {
			Thread.sleep(10000);
			//@FindBy(xpath=Locator.USERNAME_XPATH);
			driver.findElement(By.xpath(Locator.USERNAME_XPATH)).sendKeys(TestData.USERNAME);
			driver.findElement(By.xpath(Locator.PASSWORD_XPATH)).sendKeys(TestData.PASSWORD);
			driver.findElement(By.xpath(Locator.LOGINBUTTON_XPATH)).click();
			driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
