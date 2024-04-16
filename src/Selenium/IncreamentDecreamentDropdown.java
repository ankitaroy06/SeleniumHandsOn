package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IncreamentDecreamentDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//to check how many adults passenger initially
		System.out.println("initial: " + driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000L);
		for(int i=0;i<4;i++)// adding 5 adults
			driver.findElement(By.id("hrefIncAdt")).click();
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//to check how many adults passenger initially
		System.out.println("Final: " + driver.findElement(By.id("divpaxinfo")).getText());
		//using assertions
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		driver.quit();
	}

}
