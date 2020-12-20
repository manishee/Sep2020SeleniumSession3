//*** Dec 17-P1****
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {

		//all links -> a
		//multiple images -> img
		//multiple text fields -> input
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.ca");
		
		//get the total number of links
		//get the text of each link
		//ignore the blank text
		
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println("total links are " +linklist.size());//size method will return the total number of links
		
		for(int i=0;i<linklist.size(); i++) {
			String text=linklist.get(i).getText();
			//System.out.println(text);
			if(!text.isEmpty()) {
				System.out.println(i + "--> " +text);
			}
		}
		
	}

}
