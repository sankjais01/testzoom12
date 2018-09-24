package locators;

public class Locator {

	//URL OF EACH PAGES
	public static final String DASHBOARD_URL = "http://staging.zoom12.com/#/";
	
	
	//XPATH OF OBJECTS OVER LOGIN PAGE 
	public static final String USERNAME_XPATH = "//input[@id='name']";
	public static final String PASSWORD_XPATH = "//input[@id='password']";
	public static final String FORGOTPASSWORDLINK_XPATH = "//a[@id='forgot']";
	public static final String SIGNUPLINK_XPATH = "//a[@ng-click='ctrl.gotoRegistration()']";
	public static final String LOGINBUTTON_XPATH = "//button[@id='login']";
	public static final String KNOWMORELINK_XPATH = "//div[@class='login-right']//div//a[@class='btn btn-secondary'][contains(text(),'Know more about us')]";


	
}
