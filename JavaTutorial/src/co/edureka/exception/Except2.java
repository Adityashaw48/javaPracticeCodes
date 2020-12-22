package co.edureka.exception;

public class Except2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="625";
		System.out.println(s1+635);
		int s2=Integer.parseInt(s1);
		System.out.println(s2+635);
		
		s1="A";
		s2=Integer.parseInt(s1);//NumberFormatException

	}

}
