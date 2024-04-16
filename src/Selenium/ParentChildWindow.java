package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

		driver.findElement(By.className("blinkingText")).click(); // clicking on the text which will redirect to other child window

		// handling the 2 windows, parent and child
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> i = windows.iterator();
		String parentWindow = i.next();
		String childWindow = i.next();

		// switching window to child Window
		driver.switchTo().window(childWindow);
		// extracting the username from the text para
		String username = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].split("with")[0].trim();
		System.out.println(username);

		// switching to parent window and insert the username
		driver.switchTo().window(parentWindow);
		// filling the form in the first page
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys("learning");

		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();

		// handling the HTML alert
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));
		driver.findElement(By.id("okayBtn")).click();

		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select selectObj = new Select(dropdown);
		selectObj.selectByValue("consult");

		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		//driver.quit();
	}

}
