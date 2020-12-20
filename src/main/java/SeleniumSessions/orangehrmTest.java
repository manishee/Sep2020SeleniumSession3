//DEc16- P4****
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class orangehrmTest {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.init_driver("chrome");
		
		
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(6000);
		String title=br.getPageTitle();
		System.out.println(title);
		
		By FName=By.id("Form_submitForm_FirstName");
		By LName=By.id("Form_submitForm_LastName");
			
		ElementUtil eleUtil=new ElementUtil(driver);
		if(eleUtil.doIsDisplayed(FName)) {
		
		eleUtil.doSendKeys(FName, "Manish");
		}
		eleUtil.doSendKeys(LName, "Chugh");
		
		br.closeBrowser();
		
	}

}
