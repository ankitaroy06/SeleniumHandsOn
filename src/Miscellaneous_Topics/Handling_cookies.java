package Miscellaneous_Topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().deleteAllCookies(); // to delete all the cookies
		driver.manage().deleteCookieNamed("abc"); // to delete a particular cookies by any chance we know the name of the cookie
		
		//how to delete the session cookie and the website should logout
		driver.manage().deleteCookieNamed("sessionKey"); // by deleting the session cookie which might have "session" word in its name;
	}

}
