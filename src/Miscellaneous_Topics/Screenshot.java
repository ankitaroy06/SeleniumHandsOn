package Miscellaneous_Topics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		//capturing screenshot of window.
		File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File("D:\\Datafile\\screenshot.png"));
		
		//capturing screenshot of particular area
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Selenium");
		File screenshot1= driver.findElement(By.xpath("//input[@name='name']")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1,new File("D:\\Datafile\\screenshot1.png"));
		
		//capturing dimension of the required area
		int height= driver.findElement(By.xpath("//input[@name='name']")).getRect().getHeight();
		int width = driver.findElement(By.xpath("//input[@name='name']")).getRect().getWidth();
		System.out.println("Height: "+ height + " Widht: "+ width);
		driver.quit();

	}
}
