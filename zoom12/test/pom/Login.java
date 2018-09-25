package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.Locator;
import zoom12.TestData;

public class Login {

	/*
	 * @FindBy(xpath = Locator.USERNAME_XPATH) public static WebElement username;
	 * 
	 * @FindBy(xpath = Locator.PASSWORD_XPATH) public static WebElement passowrd;
	 * 
	 * @FindBy(xpath = Locator.LOGINBUTTON_XPATH) public static WebElement
	 * loginButton;
	 * 
	 * @FindBy(xpath = Locator.FORGOTPASSWORDLINK_XPATH) public static WebElement
	 * forgotLink;
	 * 
	 * @FindBy(xpath = Locator.KNOWMORELINK_XPATH) public static WebElement
	 * knowmore;
	 */

	public void ValidEmail() {

	}

	public static boolean ValidLogin(WebDriver driver, TestData data) {

		WebDriverWait wait = new WebDriverWait(driver, 10000);
		boolean flag = true;
		driver.get(Locator.LOGIN_URL);
		try {

			Thread.sleep(10000);
			/*
			 * // wait.until(ExpectedConditions.visibilityOf(username));
			 * driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
			 * username.sendKeys(data.USERNAME); //
			 * wait.until(ExpectedConditions.visibilityOf(passowrd));
			 * passowrd.sendKeys(data.PASSWORD); //
			 * wait.until(ExpectedConditions.visibilityOf(loginButton));
			 * loginButton.click();
			 * 
			 * // @FindBy(xpath=Locator.USERNAME_XPATH); //
			 */

			driver.manage().timeouts().implicitlyWait(300000, TimeUnit.SECONDS);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator.USERNAME_XPATH)));
			driver.findElement(By.xpath(Locator.USERNAME_XPATH)).sendKeys(data.USERNAME);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator.PASSWORD_XPATH)));
			driver.findElement(By.xpath(Locator.PASSWORD_XPATH)).sendKeys(data.PASSWORD); //
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator.LOGINBUTTON_XPATH)));
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
