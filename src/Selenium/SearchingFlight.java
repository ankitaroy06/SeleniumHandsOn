package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchingFlight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//selecting destination
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id= 'ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		
		//selecting dates
		driver.findElement(By.cssSelector(".ui-datepicker-week-end.ui-datepicker-days-cell-over.ui-datepicker-today")).click();
		
		//selecting passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000L);
		for(int i=0;i<4;i++)// adding 5 adults
			driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//selecting currency
		WebElement dropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select selectObj = new Select(dropdown);
		selectObj.selectByVisibleText("INR");
		
		//selecting quota
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		
		//clicking on search button to search flight
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(5000);
		
		driver.quit();
	}

}
