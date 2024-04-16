package Assingments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		//filling the form in the first page
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		//handling the HTML alert
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement dropdown= driver.findElement(By.xpath("//select[@class='form-control']"));		
		Select selectObj = new Select(dropdown);
		selectObj.selectByValue("consult");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		wait.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop")); // explicit wait until the page fully loaded
		
		//collecting all the buttons and clicking them
		List<WebElement> addButtons= driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for(int i=0;i<addButtons.size();i++)
			addButtons.get(i).click();
		
		driver.findElement(By.xpath("//a[@class= 'nav-link btn btn-primary']")).click();
	}

}
