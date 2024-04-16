package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium WebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//below codes will only support if the dropdown elements having "Select" Tag
		WebElement dropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select selectObj = new Select(dropdown);
		//selecting options options based on their index number
		selectObj.selectByIndex(3);
		System.out.println("By index: " + selectObj.getFirstSelectedOption().getText());
		
		//selecting options based on their Text
		selectObj.selectByVisibleText("AED");
		System.out.println("By Text: " + selectObj.getFirstSelectedOption().getText());
		
		//selecting options based on their values, here values represents the HTML attribute, which is value, of an option
		selectObj.selectByValue("INR");
		System.out.println("By value: " +selectObj.getFirstSelectedOption().getText());
		driver.quit();
	}

}
