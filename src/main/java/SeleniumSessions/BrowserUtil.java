//*** Dec 16-P1****
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	WebDriver driver;
	
	/**
	 * 
	 * @param browserName
	 * @return this returns driver
	 */
	public WebDriver init_driver(String browserName)
	{
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(browserName.equals("safari")) {
			driver=new SafariDriver();
		}else {
			System.out.println("please pass the correct browser");
		}
		
		return driver;
		
	}
	/**
	 * This method is used to launch a url
	 * @param url
	 * 
	 */
	public void launchUrl(String url) {
		System.out.println("url = " + url);
		driver.get(url);
	}
	/**
	 * this method is used to navigate to a url
	 * @param url
	 */
	public void navigateTourl(String url) {
		System.out.println("url = " + url);
		driver.navigate().to(url);
	}
	/**
	 * this method is used to get the title of the page
	 * @return
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}
	/**
	 * this method is used to quit the browser
	 */
	public void quitBrowser() {
		driver.quit();
	}
	/**
	 * this method is used to close the browser
	 */
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
}
