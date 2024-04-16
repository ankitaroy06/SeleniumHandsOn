package GreenKart;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(5000); // so that all the items list gets loaded
		String veggie[] = { "Brocolli", "Cucumber", "Cauliflower", "Beetroot", "Mushroom" };
		List<String> veggieList= Arrays.asList(veggie); // converting Array as List so that searching with the name will be easy
		List<WebElement> items = driver.findElements(By.className("product-name"));
		//finding all the elements at once
		int count=0;
		for(int i=0;i<items.size();i++) {
			String itemName = items.get(i).getText().split(" ")[0]; //here the extracted text is (for eg), Brocolli - 1 kg. But we need Brocolli. Hence we are adding split function to get the first split value.
			if (veggieList.contains(itemName)) 
			{
				count++;
				/* Hence this code is very inconsistent as the locator what we have selected is not static. We have used text locator, which is changing depending upon the actions taken.
				 * driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				   Thread.sleep(5000);
				*/
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(count==veggie.length)
					break;
			}			
		}
		
		/* checking 1 element at a time
		 * for (int i = 0; i < items.size(); i++) {
			String itemName = items.get(i).getText();
			if (itemName.contains(veggie[0])) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}*/
		
		Thread.sleep(5000);
		//driver.quit();
	}
}
