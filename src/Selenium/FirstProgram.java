package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chrome-> chrome driver -> methods close
		//ChromeDriver class will implememt the methods from WebDriver Class and can also have its own methods.
		// ChromeDriver driver = new ChromeDriver(); This way we can implement all the methods implemented by chromeDriver, including methods which only belongs to chromedriver, which may not work for other browsers
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium WebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Outputs from Chrome browser");
		driver.get("https://www.edureka.co/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		//driver.close(); this method will only close the initial tab, and doesn't acre about other tas got opened during the process. But quit() method will close all the tabs which got opened during the automation process.

		//to invoke firefox browser
		System.setProperty("webdriver.gecko.driver","D:\\Selenium WebDriver\\FirefoxDriver\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		System.out.println("Outputs from Firefox browser");
		driver1.get("https://www.edureka.co/");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		driver1.quit();
		
		//to invoke edge browser
		System.setProperty("webdriver.edge.driver","D:\\Selenium WebDriver\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		System.out.println("Outputs from edge browser");
		driver2.get("https://www.edureka.co/");
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getCurrentUrl());
		driver2.quit();
	}
}
