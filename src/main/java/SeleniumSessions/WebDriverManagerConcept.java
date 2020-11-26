package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://google.com");//Launch URL
		
		String title = driver.getTitle();//Get the page title
		
		System.out.println("page title is : " + title);
		
		//checkpoint/verification point:
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		//get the current url
		System.out.println(driver.getCurrentUrl());	
		if(driver.getCurrentUrl().contains("google")) {
			System.out.println("url is correct");
		}
		
		//get the current page source
		//System.out.println(driver.getPageSource());
		
		//driver.close();-> to close the browser
		//driver.quit();//-> to close the browser
	}

		
	}


