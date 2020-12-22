class A {
	int a=10,b=20;
	void displayAB() {
		System.out.println(a+" | "+b);
	}
}

class B extends A{
	int c=30,d=40;
	void displayCD() {
		System.out.println(a+" | "+b+" |" +c+" | "+d);
	}
}


public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		System.out.println(obj.a+" | "+obj.b+" |" +obj.c+" | "+obj.d);
		obj.displayAB();
		obj.displayCD();

	}

}
