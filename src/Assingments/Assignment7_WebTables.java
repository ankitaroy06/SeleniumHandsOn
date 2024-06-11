package Assingments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//to find total number of rows
		System.out.println("Total number of rows : "+ driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
		
		//to find total number of columns
		System.out.println("Total number of columns : "+ driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size());
		
		//to print the contents of 3rd row
		List<WebElement> content = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
		for (int i=0;i<content.size();i++)
			System.out.println((i+1)+". Element of the row: "+ content.get(i).getText());
		
		driver.quit();
	}

}
