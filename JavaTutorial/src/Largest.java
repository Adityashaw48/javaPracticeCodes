import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b=sc.nextInt();
		
		largest(a,b);
		sc.close();
	}
	
	static void largest(int a , int b) {
		int sum=a+b;
		System.out.println("Sum of two Numbers "+a+" and "+b+" is "+sum);
	}
}
