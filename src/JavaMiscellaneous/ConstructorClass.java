package JavaMiscellaneous;

/*
 * This is a java constructor class, which is called from "Inheritance_ChildClass" Class using TestNG method and Parameterized constructor.
 */

public class ConstructorClass {
	
	String name="";
	public ConstructorClass(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	public void printName() {
		System.out.println("Name: " + name);
	}

	public void greetings() {
		System.out.println("Hello " + name);
	}
}
