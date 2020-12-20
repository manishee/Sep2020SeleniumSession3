//Dec 16-P2***
package SeleniumSessions;

public class LoginPage {

	public static void main(String[] args) {

		BrowserUtil br=new BrowserUtil();
		br.init_driver("chrome");
		
		br.launchUrl("https://www.google.com");
		//br.navigateTourl("https://www.google.com");
		String title=br.getPageTitle();
		if(title.equals("Gooogle")) {
			System.out.println("correct title");
		}else {
			System.out.println("incorrect title");
		}
		//br.closeBrowser();
		//br.quitBrowser();
		
	}

}
