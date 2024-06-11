package Miscellaneous_Topics;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//to sort the elements in alphabetical order of the table using stream
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//table//th[1]")).click();
		List<WebElement> webelementsList= driver.findElements(By.xpath("//table//tbody//tr//td[1]"));
		List<String> originalList= webelementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> elements= originalList;
		List<String> finalList= elements.stream().sorted().collect(Collectors.toList());
		Assert.assertEquals(originalList, finalList);
		
		//finding the price of the required list item
		webelementsList.stream().filter(s->(s.getText()).contains("Beans")).map(s-> s.findElement(By.xpath("//following-sibling::td")).getText()).forEach(a->System.out.print(a));
				
		driver.quit();
		
	}

}
