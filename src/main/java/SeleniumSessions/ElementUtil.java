//Dec16-P3***
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	/**
	 * 
	 * @param value
	 * @return
	 */
	public By getLocator(String value) {
		return By.id(value);
	}
	/**
	 * 
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	/**
	 * this method is used to write in a text box
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	/**
	 * this method clicks on a web element
	 * @param locator
	 */
	public void doClick(By locator) {
		getElement(locator).click();
	}
	/**
	 * 
	 * @param locator
	 * @return this returns the text from a web element
	 */
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	/**
	 * This method will check if a web element is present on a page
	 * @param locator
	 * @return this returns true/false
	 */
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
}
