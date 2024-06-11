package Miscellaneous_Topics;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to check whether search is filtering relevant data
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		String value = "Rice";
		driver.findElement(By.xpath("//input[@id= 'search-field']")).sendKeys(value);
		List<WebElement> outputTextList= driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<String> expectedList= outputTextList.stream().filter(s->s.getText().contains(value)).map(s->s.getText()).collect(Collectors.toList());
		Assert.assertEquals(outputTextList.size(), expectedList.size());
		
		driver.quit();
	}

}
