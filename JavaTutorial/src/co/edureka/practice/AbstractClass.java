package co.edureka.practice;

abstract class Demo{
	abstract void displ();
	void dem() {
		System.out.println("In Abstarct class");
	}
}

public class AbstractClass extends Demo{
	
	public static void main(String[] args) {
		AbstractClass obj=new AbstractClass();
		obj.displ();
		obj.dem();
	}
	
	void displ() {
		System.out.println("Abstract Example");
	}
}
