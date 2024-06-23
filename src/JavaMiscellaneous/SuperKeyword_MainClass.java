package JavaMiscellaneous;

import org.testng.annotations.Test;

public class SuperKeyword_MainClass {

		@Test
		public void MainMethod() {
			SuperKeyword_ChildClass obj= new SuperKeyword_ChildClass(4,2);
			obj.add();
			obj.subtract();
			obj.multiply();
			obj.divide();
	}

}
