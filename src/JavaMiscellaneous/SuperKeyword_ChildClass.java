package JavaMiscellaneous;

public class SuperKeyword_ChildClass extends SuperKeyword_ParentClass {

	int a, b;
	
	public SuperKeyword_ChildClass(int a, int b) {
		super(a,b);
		this.a= a;
		this.b=b;
	}

	public void add() {
		int sum= a+b;
		System.out.println("Sum: "+ sum);
	}
	
	public void subtract() {
		int minus= a-b;
		System.out.println("Minus: "+ minus);
	}

}
