package Assingments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Selenium");
		driver.findElement(By.name("email")).sendKeys("selenium@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Password!");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		driver.findElement(By.xpath("//option[text()='Female']")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("06.30.1999");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		driver.quit();
	}
}
