package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Program5 {
	
	@Test (groups={"important"})
	public void method_1() {
		System.out.println("Class: Program5; Method: 1");
	}
	
	@AfterTest
	public void method_2() {
		System.out.println("Class: Program5; Method: 2; Remark: This method shows the demo of @AfterTest annotation.");
	}
	
	@AfterSuite
	public void method_3() {
		System.out.println("Class: Program5; Method: 3; Remark: This method shows the demo of @AfterSuite annotation.");
	}
	@BeforeTest
	public void method_4() {
		System.out.println("Class: Program5; Method: 4; Remark: This method shows the demo of @BeforeTest annotation.");
	}
	@BeforeSuite
	public void method_5() {
		System.out.println("Class: Program5; Method: 5; Remark: This method shows the demo of @BeforeSuite annotation.");
	}
}
