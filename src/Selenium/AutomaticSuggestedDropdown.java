package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomaticSuggestedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		/*Dont know but this line throwing error, but below line is working. Magic! 
		 * List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		*/
		  List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement i: options) {
			System.out.println(i.getText());
			if(i.getText().equalsIgnoreCase("India")) {
				i.click();
				break;
			}	
		}
		driver.quit();
	 }

}
