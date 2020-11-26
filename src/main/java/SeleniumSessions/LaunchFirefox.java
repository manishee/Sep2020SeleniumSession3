package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/mchugh/Downloads/geckodriver");
		
		
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}
