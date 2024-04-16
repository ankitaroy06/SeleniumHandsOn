package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Selenium");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		System.out.println("First alert: "+ driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		System.out.println("Second alert: "+ driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.quit();
	}

}
