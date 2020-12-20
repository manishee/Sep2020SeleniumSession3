//*** Dec10-P1*****
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DIfferentLocators {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(6000);
		
		//1. id ->unique
		
		//2. name ->not unique
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//		Thread.sleep(6000);
//		driver.findElement(By.name("FirstName")).sendKeys("Manish");
//		driver.findElement(By.name("LastName")).sendKeys("Chugh");
//		
		//3. xpath -> is not an attribute. Its a locator(address of the element in DOM)
		
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("//*[@id=\"Form_submitForm_FirstName\"]")).sendKeys("Manish");
		
		//4. css selector -> is not an attribute.
		//driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//Thread.sleep(6000);
		//driver.findElement(By.cssSelector("#Form_submitForm_LastName")).sendKeys("Chugh");
		
		//5. linkText ->Only for links..having <a> tag
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//		Thread.sleep(6000);
//		driver.findElement(By.linkText("Privacy Policy")).click();
		
		//6. PartialLinkText -> only for links -> long link text
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//		Thread.sleep(6000);
//		driver.findElement(By.partialLinkText("Privacy")).click();
//		
		//7. tagName ->used to get the elements on the page for eg. No. of links, images
//		driver.get("https://www.freework.com/");
//		Thread.sleep(6000);
//		
//		String h2_text=driver.findElement(By.tagName("h2")).getText(); 
//		System.out.println(h2_text);
//		
//		String text=driver.findElement(By.linkText("Sign up")).getText();
//		System.out.println(text);
		
		By ES_localization_link=By.linkText("ES");
		
		String text=doGetText(ES_localization_link);
		System.out.println(text);
	
//		boolean b=driver.findElement(By.id("Form_submitForm_FirstName")).isDisplayed();
//		if(b) {
//			System.out.println("element present");
//		}else
//		{
//			System.out.println("element not present");
//		}
		
		By FName=By.id("Form_submitForm_FirstName");
		if(doIsDisplayed(FName)) {
			System.out.println("FName element is present");
			doSendKeys(FName, "Manish");
			
		}
		if(doIsDisplayed(ES_localization_link)) {
			System.out.println("ES_localization_link is present");
			doClick(ES_localization_link);
		}
				
		//8. classname
		
//		driver.get("https://authentication.td.com/uap-ui/index.html?consumer=easyweb&locale=en_CA#/login/easyweb-getting-started");
//		Thread.sleep(6000);
//		driver.findElement(By.className("otp-always-show-error")).sendKeys("1234636456");
		
		
		//username -> ng-pristine ng-valid form-control ng-empty ng-untouched
		//password -> otp-always-show-error ng-pristine ng-untouched ng-valid form-control ng-empty
	}
	public static By getLocator(String value) {
		return By.id(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
}
