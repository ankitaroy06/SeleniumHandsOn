package JavaMiscellaneous;

public class SuperKeyword_ParentClass {
	
	int a,b;
	
	public SuperKeyword_ParentClass(int a, int b) {
		this.a =a;
		this.b= b;
	}

	public void multiply() {
		int product= a*b;
		System.out.println("Product: "+ product);
	}
	
	public void divide() {
		int divide= a/b;
		System.out.println("Divide: "+ divide);
	}

}
