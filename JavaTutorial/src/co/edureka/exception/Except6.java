package co.edureka.exception;

public class Except6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,10};
		String s1="A";
		try {
			System.out.println(50/0);
			System.out.println(arr[2]);
			System.out.println(Integer.parseInt(s1));
		}
		catch(Exception ex) {
			System.out.println("Exception Occured!");
			System.out.println("ObjectType: "+ex.toString());
			System.out.println("Message: "+ex.getMessage());
			ex.printStackTrace();
		}
	}

}
