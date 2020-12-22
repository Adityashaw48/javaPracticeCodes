class A1{
	void display() {
		System.out.println("Inside class: A");
	}
}
class B1 extends A1{
	@Override
	void display() {
		System.out.println("Inside class: B");
	}
}
public class Polymorphism {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj = new A1();
		B1 obj2 = new B1();
		A1 obj3 = new B1(); //Type of object is decided as Runtime rather than Compile time
		//A child class object can be referenced by a super class
		obj.display();
		obj2.display();
		obj3.display();
	}

}
