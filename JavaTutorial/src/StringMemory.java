
public class StringMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Aditya";
		String s2="Aditya";
		if(s1==s2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		String s3= new String("Aditya");//created in heap as well as String constant pool
		String s4= new String("Aditya");
		System.out.println(s3==s4);//false
	}

}
