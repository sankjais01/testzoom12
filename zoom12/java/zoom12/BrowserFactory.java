package zoom12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	static WebDriver driver;

	public static WebDriver createBrowser(String type) {
		if (type.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sanket\\git\\testzoom12\\zoom12\\lib\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (type.contains("ie")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\sanket\\git\\testzoom12\\zoom12\\lib\\ie\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (type.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\sanket\\git\\testzoom12\\zoom12\\lib\\gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();

		return driver;
	}
}