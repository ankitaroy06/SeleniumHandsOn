package GreenKart;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToCartOptimised {

	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //implicit wait, global timeout concept
		
		String veggie[] = { "Brocolli", "Cucumber", "Cauliflower", "Beetroot", "Mushroom" }; //customer required order list
		List<String> veggieList= Arrays.asList(veggie); // converting to List type collection
		
		AddToCartOptimised obj= new AddToCartOptimised(); // new object to call the "addingitems" method
		obj.addingitems(driver, veggieList); // passing the 'driver' obj of web driver and 'veggieList' as the customer requirements. This method will add all the required items to the cart
		
		driver.findElement(By.className("cart-icon")).click(); // to check the added items
		driver.findElement(By.xpath("//div[@class='action-block']/button[text()='PROCEED TO CHECKOUT']")).click(); // to proceed for placing order
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode"))); // explicit wait to the contents get loaded

		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy"); // applying code to avail discount
		driver.findElement(By.className("promoBtn")).click(); //clicking on "apply" button
		 // need to wait for sometime before the code gets successfully applied.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo"))); // this section takes some time to get loaded. hence, the explicit wait is applied.
		Assert.assertEquals((driver.findElement(By.className("promoInfo")).getText()), "Code applied ..!"); // to check whether the code is successfully applied or not
	}
	
	public void addingitems(WebDriver driver, List<String> veggieList) 
	{
		/*
		 *  this method takes 'driver' object of WebDriver class and 'veggieList', which is the required list of the customer, as arguments.
		 *  And adds all the required items to the cart.
		*/
		int count=0; // to keep track of how many items are getting added to the list
		List<WebElement> items = driver.findElements(By.className("product-name")); // filtering the webelemts of the items available in the store
		for(int i=0;i<items.size();i++) {
			// extracting name of the items available in the store
			String itemName = items.get(i).getText().split(" ")[0]; //here the extracted text is (for eg), Brocolli - 1 kg. But we need Brocolli. Hence we are adding split function to get the first split value.
			if (veggieList.contains(itemName)) // checking whether the extracted item name is in the veggieList List
			{
				// if 'yes', then, adding the item to the cart and increasing the count variable by 1.
				count++;				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(count==veggieList.size()) //if the total items added to the cart is same as the customers list size, then breaking the loop.
					break;
			}			
		}
	}

}
