package co.edureka.exception;

public class Except5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,10};
		String s1="A";
		try {
			System.out.println(50/0);
			System.out.println(arr[2]);
			System.out.println(Integer.parseInt(s1));
		}
		catch(ArithmeticException ex) {
			System.out.println("Divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array out of  bound");
		}
		catch(NumberFormatException ex) {
			System.out.println("Number Format Exception");
		}
	}

}
