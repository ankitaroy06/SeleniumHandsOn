package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		LocatorsPractice obj= new LocatorsPractice();
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium WebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//adding time lapse code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); //going to the target website
		
		//trying to sign in 
		driver.findElement(By.id("inputUsername")).sendKeys("Selenium");
		driver.findElement(By.name("inputPassword")).sendKeys("Password!");
		driver.findElement(By.className("signInBtn")).click();
		
		//to print the error
		//System.out.println(driver.findElement(By.className("error")).getText()); used classname to find element OR below
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //used cssSelector to find element
		
		//to find default password
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);//script will pause for 2secs; 1000=1sec
		//difference between sleep and implicityWait is, when we need the page to come in stable condition and when we need something to appear after certain calculations/ process
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Selenium@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9876543210");
		//to clear any text field; driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).clear();
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String reset_login_text= driver.findElement(By.className("infoMsg")).getText(); //storing default password text
		System.out.println(reset_login_text);
		String password= obj.getPassword(reset_login_text);
		System.out.println(password);
		
		
		//trying to sign in now with default password
		Thread.sleep(2000);
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("Selenium");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000); // so that sign in performs completely
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		driver.findElement(By.xpath("//*[text()= 'Log Out']")).click();
		driver.quit();
		
	}
	
	public String getPassword(String str) {
		String[] array1= str.split("'");
		String[] array2= array1[1].split("'");
		String password= array2[0];
		return password;
	}

}
