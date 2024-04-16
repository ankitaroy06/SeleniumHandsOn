package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class DateSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("button[class='ui-datepicker-trigger']")).click();
		//driver.findElement(By.cssSelector("a[class='ui-datepicker-today']")).click();
		driver.findElement(By.cssSelector(".ui-datepicker-week-end.ui-datepicker-days-cell-over.ui-datepicker-today")).click();
		
		//to identify Selector is enabled or disabled
		System.out.println("Before: "+(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		System.out.println("After: "+(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")));
		
		driver.quit();
	}
}
