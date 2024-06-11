package Selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollWindowOrContents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)"); // scrolling the window
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop = 500"); // scrolling the table
		
		//summation of all the values of the table last column
		List<WebElement> list= driver.findElements(By.xpath("//table[@id='product']/tbody/tr/td[4]"));
		int sum=0, i;
		for(i=0;i<list.size();i++)
		sum+= Integer.parseInt(list.get(i).getText());
		
		System.out.println("Sum of all the values= "+ sum);
		
		//comparing the expected result and the actual result
		int expectedResult= Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, expectedResult);
		driver.quit();
	}

}
