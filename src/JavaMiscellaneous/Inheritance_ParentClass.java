package JavaMiscellaneous;

/*
 * The @BeforeTest method is not showing in the TestNG results because it is not a test method. 
 * To see all methods in the results, ensure they are annotated with @Test. 
 * If the method is intended to be a setup or configuration method, it should remain annotated with @BeforeTest and will not appear in the test results.
 */

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Inheritance_ParentClass {

	@Test
	public void ParentMethod_1() {
		System.out.println("Parent Class method 1.");
	}
	
	@BeforeTest
	public void ParentMethod_2() {
		System.out.println("Parent Class method 2.");
	}

}
