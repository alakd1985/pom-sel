package testcases.mytheresa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe File PATH");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
