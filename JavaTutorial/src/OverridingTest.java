class Ab{
	int a=10,b=20;
	void display() {
		System.out.println("Inside Class A: "+a+" | "+b);
	}
}
class Ba extends Ab{
	int a=30,b=40;
	
	@Override
	void display() {
		System.out.println("Inside Class B: "+a+" | "+b+" | "+super.a);
		super.display();
		
	}
}


public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ba obj =new Ba();
		Ab obj1=new Ab();
		obj.display();
		obj1.display();
		
	}

}
