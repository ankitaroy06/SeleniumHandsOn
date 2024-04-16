package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssignment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		//How to get the Count of number of check boxes present in the page
		System.out.println("Total number of available checkboxes available in the page: "+ driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.quit();
	}
}
