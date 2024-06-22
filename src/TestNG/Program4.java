package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program4 {
	
	@Test
	public void regexNotApplicable() {
		System.out.println("Class: Program4; Method: 0; Remark: On this method regexp will not work.");
	}

	@Test
	public void regexNotApplicable1() {
		System.out.println("Class: Program4; Method: 1; Remark: On this method regexp will not work.");
	}
	
	@Test (groups={"important"})
	public void method_2() {
		System.out.println("Class: Program4; Method: 2");
	}
	
	@BeforeMethod
	public void method_3() {
		System.out.println("Class: Program4; Method: 3; Remark: This method shows the demo of @BeforeMethod annotation.");
	}
	@Test
	public void method_4() {
		System.out.println("Class: Program4; Method: 4");
	}
	@AfterMethod
	public void method_5() {
		System.out.println("Class: Program4; Method: 5; Remark: This method shows the demo of @AfterMethod annotation.");
	}

}
