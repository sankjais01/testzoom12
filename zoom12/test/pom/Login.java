package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.Locator;
import zoom12.TestData;

public class Login {

	public void ValidEmail() {

	}

	public static boolean ValidLogin(WebDriver driver) {
		boolean flag= true;
		driver.get(Locator.LOGIN_URL);
		try {

			Thread.sleep(7000);
			// @FindBy(xpath=Locator.USERNAME_XPATH);
			// driver.manage().timeouts().implicitlyWait(300000, TimeUnit.SECONDS);

			WebDriverWait wait = new WebDriverWait(driver, 30000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator.USERNAME_XPATH)));
			driver.findElement(By.xpath(Locator.USERNAME_XPATH)).sendKeys(TestData.USERNAME);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator.PASSWORD_XPATH)));
			driver.findElement(By.xpath(Locator.PASSWORD_XPATH)).sendKeys(TestData.PASSWORD);
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator.LOGINBUTTON_XPATH)));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Locator.LOGINBUTTON_XPATH)));
			driver.findElement(By.xpath(Locator.LOGINBUTTON_XPATH)).click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}
