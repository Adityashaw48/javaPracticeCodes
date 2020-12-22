
public class ArithmeticOpertors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10/3);//Integer
		System.out.println(10.0f/3);//float
		System.out.println(10/3.0f);//float
		System.out.println(10.0/3.0);//float
		
		System.out.println(10%3);//float
		System.out.println(-10%3);//float
		System.out.println(10%-3);//sign of first operand only
		System.out.println(10.0%3);//float
		System.out.println(10.0%3.0);//float
		System.out.println(10%3.0);//float
		System.out.println(10f%3.0);//float
		
		System.out.println(0/10);
		//System.out.println(10/0);//java.lang.ArithmeticException
		System.out.println(10.0/0);//Infinity
		System.out.println(10/0.0);//Infinity
		System.out.println(-10/0.0);//Infinity
		
		//System.out.println(0/0);//java.lang.ArithmeticException
		System.out.println(0.0/0);//Nan
		System.out.println(0/0.0);//Nan
		
		//byte,short,int,long,float,double [order of return type
		//max[int,typeof first op,type of 2nd op]
		byte b=12;
		byte m=13;
		//byte c=b+m; 
		int c= b+m;
		System.out.println(c);
		
		int b1=12;
		long m1=13;
		long c1= b1+m1;//long
		System.out.println(c1);
	}
}
