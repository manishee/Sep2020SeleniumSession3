//*****Nov 26-P3******
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose_Sessionsid {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/mchugh/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();//-> Will close the window in focus
		//driver.quit();// -> will close all the windows, pop ups
		
		
		//Quit
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		//Close
		//NoSuchSessionException: invalid session id
		
//		driver=new ChromeDriver();
//		driver.get("https://google.com");
//		System.out.println(driver.getTitle());
//		
	}

}
