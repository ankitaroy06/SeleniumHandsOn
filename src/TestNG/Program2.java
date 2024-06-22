package TestNG;

import org.testng.annotations.Test;

public class Program2 {

	@Test
	public void Demo() {
		System.out.println("Class: Program2; Method: Demo;");
	}
	
	@Test
	public void Demo1() {
		System.out.println("Class: Program2; Method: Demo2; Remark: Using this method as example of Exclude annotaion.");
	}
	
	@Test (groups={"important"})
	public void Demo2() {
		System.out.println("Class: Program2; Method: Demo3;");
	}
}
