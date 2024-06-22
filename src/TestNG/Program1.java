package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Program1 {
	
	@Parameters ({"suiteLevel"})
	@Test 
	public void method_1(String str) {
		System.out.println("Class: Program1; Method: 1; Remark: This is the only method availble in the class");
		System.out.println(str);
		//System.out.println(str1);
	}
	
}
