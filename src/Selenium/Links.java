package Selenium;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//to find total number of links in the page
		System.out.println("Total number of links in the page = "+ driver.findElements(By.tagName("a")).size());
		
		//to find the total number of links in the footer section
		
		/*
		 * method 1
		 * int total= driver.findElements(By.xpath("//li[@class='gf-li']/h3/a")).size()+driver.findElements(By.xpath("//li[@class='gf-li']/a")).size();
		 * System.out.println("Total number of links in the footer = "+ total); 
		 */
				
		//another method using scope concept or limiting webDriver concept to perform the above task
		WebElement footer= driver.findElement(By.id("gf-BIG"));
		System.out.println("Total number of links in the footer using Scope concept = "+ footer.findElements(By.tagName("a")).size());
		
		//using limiting webDriver concept to limit the scope till first column
		WebElement footerFirstColumn=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int footerFirstColumn_totalLink= footerFirstColumn.findElements(By.tagName("a")).size();
		System.out.println("Total number of links in the footer using Scope concept till first column = "+ footerFirstColumn_totalLink);
		
		//opening each link in new tab and checking the correctness
		for(int i=1; i<footerFirstColumn_totalLink;i++)
		{
			String clickToNewTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerFirstColumn.findElements(By.tagName("a")).get(i).sendKeys(clickToNewTab);
		}
		
		//checking whether the links opened in the new tabs are correct
		Set<String> windows= driver.getWindowHandles();
		Iterator <String> it = windows.iterator();
		while(it.hasNext()) 
		{
			System.out.println(driver.switchTo().window(it.next()).getTitle());				
		}		
		driver.quit();
	}

}
