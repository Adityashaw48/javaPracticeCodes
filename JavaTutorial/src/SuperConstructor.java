class A12{
	A12(int n){
		System.out.println("Inside A1 constructor");
	}
}
class B12 extends A12{
	B12(){
		super(2);
		System.out.println("Inside B1 constructor");
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B12 obj= new B12();
		System.out.println(obj);
	}

}
