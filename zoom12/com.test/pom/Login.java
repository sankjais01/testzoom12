package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import locators.Locator;
import zoom12.TestData;

public class Login {

	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = Locator.USERNAME_XPATH)
	static WebElement username;

	@FindBy(xpath = Locator.PASSWORD_XPATH)
	static WebElement passowrd;

	@FindBy(xpath = Locator.LOGINBUTTON_XPATH)
	static WebElement loginButton;

	@FindBy(xpath = Locator.FORGOTPASSWORDLINK_XPATH)
	static WebElement forgotLink;

	@FindBy(xpath = Locator.KNOWMORELINK_XPATH)
	static WebElement knowmore;

	public void ValidEmail() {

	}

	public boolean ValidLogin(TestData data) {

		boolean flag = true;
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		driver.get(Locator.LOGIN_URL);
		try {
			wait.until(ExpectedConditions.visibilityOf(username));
			username.sendKeys(data.USERNAME);
			wait.until(ExpectedConditions.visibilityOf(passowrd));
			passowrd.sendKeys(data.PASSWORD);
			wait.until(ExpectedConditions.visibilityOf(loginButton));
			loginButton.click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}
