package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		//given date
		String date="30", month="6", year= "2027";
		String[] expectedList= {month, date, year};
		
		//inserting the given values
		driver.findElement(By.cssSelector(".react-date-picker__calendar-button.react-date-picker__button")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+ year +"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+ date +"']")).click();
		
		//fetching the provided value and comparing with expected data
		List<WebElement> actualList= driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0;i<actualList.size();i++) {
			Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);
		}
		
		driver.quit();
	}

}
