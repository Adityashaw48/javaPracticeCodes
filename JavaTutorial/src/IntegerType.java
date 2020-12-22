
public class IntegerType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=1;
		byte c=127;
		//byte d=197; //type mismatch cannot convert from int to byte
		System.out.println(b);
		System.out.println(c);
		
		int p=123456789;
		//int m=123456789123456789; //type int is out of range
		long m=123456789123456789l; //treated as long with a suffix of l
		System.out.println(p);
		System.out.println(m);
		
		//int x=12l;//cannot convert from long to int
		int x=(int) 12l;//cannot convert from long to int [explicit conversion]
		System.out.println(x);
		

	}

}
