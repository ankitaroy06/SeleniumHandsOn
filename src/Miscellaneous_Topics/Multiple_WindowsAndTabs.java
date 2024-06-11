package Miscellaneous_Topics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_WindowsAndTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB); //to open new tab
		driver.switchTo().newWindow(WindowType.WINDOW); //to open multiple window.
		Set<String> tabs= driver.getWindowHandles();
		Iterator<String> i =tabs.iterator();
		String parent =i.next();
		String child=i.next();
		driver.switchTo().window(child);
		
		driver.get("https://rahulshettyacademy.com/");
		String textName=driver.findElements(By.xpath("//div[@class='upper-box']/h2/a[contains(@href,'https://courses.rahulshettyacademy.com/')]")).get(0).getText();
		
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(textName);
		
		driver.quit();
	}

}
