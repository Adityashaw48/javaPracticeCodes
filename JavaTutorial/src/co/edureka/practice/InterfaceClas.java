package co.edureka.practice;

interface InterfaceC {
	//void dem();
	abstract void displ();
}

interface InterfaceC1 {
	//void dem();
	abstract void disply();
}


public class InterfaceClas implements InterfaceC,InterfaceC1{
	
	public static void main(String[] args) {
		InterfaceClas obj=new InterfaceClas();
		obj.displ();
		//obj.dem();
	}
	
	public void displ() {
		System.out.println("INterface Example");
	}
	
	public void disply() {
		System.out.println("INterface Example");
	}
}

