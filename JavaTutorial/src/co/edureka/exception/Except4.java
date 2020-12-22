package co.edureka.exception;

public class Except4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(50/10);
		}
		catch(ArithmeticException ex) {
			System.out.println("Divide by zero");
		}

	}

}
