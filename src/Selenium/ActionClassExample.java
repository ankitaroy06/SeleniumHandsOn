package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/amazonprime");
		
		Actions action = new Actions(driver);
		
		//hovering on a particular element
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		//inserting text in CAPS using keyboard SHIFT
		action.moveToElement(driver.findElement(By.className("nav-search-field"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		//inserting text in CAPS using keyboard SHIFT and selecting the complete text
		action.moveToElement(driver.findElement(By.className("nav-search-field"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

		//right clicking on the website
		action.contextClick().build().perform();
		//driver.quit();

	}

}
