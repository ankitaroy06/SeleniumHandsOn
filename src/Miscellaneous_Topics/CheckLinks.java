package Miscellaneous_Topics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

// to check every link present in the page. Every link is working link or broken link
public class CheckLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		int i,respondCode;
		String url="";
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		SoftAssert softA = new SoftAssert();
		
		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		for(i=0;i<links.size();i++) {
			url = links.get(i).getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			respondCode= conn.getResponseCode();
			softA.assertTrue(respondCode<=400, "Broken Link: "+ links.get(i).getText()+" ; Respond Code: "+ respondCode);
		}
		
		softA.assertAll();
		driver.quit();
	}

}
