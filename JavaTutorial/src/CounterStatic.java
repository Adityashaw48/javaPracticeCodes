
class CounterStatic {
	
	//int n=10;
	static int n=10;
	void inc() {
		n=n+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterStatic obj1=new CounterStatic();
		CounterStatic obj2=new CounterStatic();
		CounterStatic obj3=new CounterStatic();
		obj1.inc();
		obj2.inc();
		obj3.inc();
		System.out.println(CounterStatic.n);
		System.out.println(CounterStatic.n);
		System.out.println(CounterStatic.n);
	}

}
