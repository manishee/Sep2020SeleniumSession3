//*** Dec2-P1****
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//findElement -> is used to create the webelement
		WebElement url_ele=driver.findElement(By.id("Form_submitForm_subdomain"));//V1 DOM
		
		url_ele.sendKeys("learnautomation.com");// ->type/write in the text box
		
		driver.navigate().refresh();
		
		url_ele=driver.findElement(By.id("Form_submitForm_subdomain")); //V2 DOM
		
		url_ele.sendKeys("learnautomation1234.com");
		//StaleElementReferenceException: 
		//stale element reference: element is not attached to the page document
		

	}

}
