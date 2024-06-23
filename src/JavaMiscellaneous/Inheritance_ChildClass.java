package JavaMiscellaneous;

/* Inheritance using TestNG, the Inheritance_ChildClass extends the Inheritance_ParentClass. The @BeforeTest annotated method in the parent class and the @Test annotated methods in both classes will be executed when running the tests. */

/*
 * Test Execution: 
 * When you execute tests in TestNG for the Inheritance_ChildClass, TestNG will:
 * Run all @BeforeTest annotated methods before any @Test annotated methods.
 * Execute @Test methods in both the parent and child classes.
 */

/*
 *Expected Output. When you run the tests, the output will be as follows:
 *The @BeforeTest method ParentMethod_2 from the parent class will be executed first.
 *The @Test methods in the parent and child classes will be executed. However, TestNG might run the methods in any order since they are in separate classes and not explicitly ordered. Typically, it runs all the test methods in a parent class before the child class, but this isn't guaranteed without explicit configuration. 
 */

/*
 * Explanation:
 * ParentMethod_2: As it is annotated with @BeforeTest, it runs before any test methods.
 * ParentMethod_1 (from Inheritance_ParentClass): It runs because it's a test method in the parent class.
 * ChildMethod_1 (from Inheritance_ChildClass): It runs because it's a test method in the child class. Inside ChildMethod_1, it calls ParentMethod_1 explicitly, resulting in the "Parent Class method 1." message again.
 */

/*
 * In TestNG, when you extend a class that contains methods annotated with @Test, those methods are inherited by the child class and executed as part of the test suite. This is because TestNG considers all @Test methods from the parent class as part of the test context of the child class as well.
 * Inheritance of Annotations: In Java, when a child class extends a parent class, all methods (including those annotated with @Test) from the parent class are inherited by the child class.
 * Execution Flow: When TestNG runs a test class, it looks for all methods annotated with @Test within that class and any superclass. TestNG will then execute all those methods as part of the test run.
 */

import org.testng.annotations.Test;

public class Inheritance_ChildClass extends Inheritance_ParentClass {

	@Test
	public void ChildMethod_1() {
		System.out.println("Child Class method 1.");
		ParentMethod_1();
	}
	
	@Test
	public void ChildMethod_2() {
		String name= "ABC";
		ConstructorClass obj= new ConstructorClass(name);
		obj.printName();
		obj.greetings();
	}

}
