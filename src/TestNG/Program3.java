package TestNG;

import org.testng.annotations.Test;

public class Program3 {
	
	@Test(groups={"important"})
	public void Demo() {
		System.out.println("Class: Program3; Method: Demo;");
	}
	
	@Test
	public void Demo1() {
		System.out.println("Class: Program3; Method: Demo2;");
	}
	
	@Test
	public void Demo2() {
		System.out.println("Class: Program3; Method: Demo3; Remark: Using this method as example of Include annotaion.");
	}
}