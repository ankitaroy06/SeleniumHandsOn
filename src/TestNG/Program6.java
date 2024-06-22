package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Program6 {
	
	@Parameters({"suiteLevel"})
	@Test (timeOut=1000)
	public void method_z(String str) {
		System.out.println("Class: Program6; Method: z; Remark: This method is demo of enabled attribute, with help of helper annotations.");
		System.out.println(str);
	}
	
	@Test (dependsOnMethods= {"method_z"})
	public void method_a() {
		System.out.println("Class: Program6; Method: a;  Remark: This method will be executing after method_z, with help of helper annotations.");
	}
	
	@Test (enabled=false)
	public void method_b() {
		System.out.println("Class: Program6; Method: b");
	}
}
