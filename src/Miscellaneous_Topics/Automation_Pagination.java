package Miscellaneous_Topics;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cont. from Sort Class
		//to find the element in the next and next page if not available in the current page
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		List<WebElement> webelementsList; 
		List<String> price;
		
		driver.findElement(By.xpath("//table//th[1]")).click();
		
		do {
			
			webelementsList= driver.findElements(By.xpath("//table//tbody//tr//td[1]"));
			price= webelementsList.stream().filter(s->(s.getText()).contains("Rice")).map(s-> s.findElement(By.xpath("//following-sibling::td")).getText()).collect(Collectors.toList());
			if(price.size()<1)
			driver.findElement(By.xpath("//a[@aria-label=\"Next\"]")).click();
		}while(price.size()<1);
		if(price.size()>=1)
			System.out.println(price.get(0));
		
		driver.quit();
	}

}
