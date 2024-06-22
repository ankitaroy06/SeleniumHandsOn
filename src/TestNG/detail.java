package TestNG;
import org.testng.annotations.Test;
public class detail {
	@Test
	public void ask_name() {
		System.out.println("What is your name? ");
	}
	
	@Test
	public void ask_age() {
		System.out.println("What is your age? ");
	}
	
	@Test
	public void ask_city() {
		System.out.println("You are from which city? ");
	}
}
