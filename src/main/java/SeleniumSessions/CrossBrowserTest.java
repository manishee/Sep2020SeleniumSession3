//*****Nov 26-P1****
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	static WebDriver driver;
	public static void main(String[] args) {
		
		String browser="safari";
				
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else if(browser.equals("safari")) {
			//WebDriverManager.safaridriver().setup();
			driver=new SafariDriver();
		}
		
		else {
			System.out.println("Please pass the correct browser " + browser);
		}
		
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();
		
	}

}
