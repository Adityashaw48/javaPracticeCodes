import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first Number");
		int a=sc.nextInt();
		//System.out.println("Enter Second Number");
		//int b=sc.nextInt();
		
		if(a%2==0) {
			System.out.println(a + " is Even!!");
		}
		else {
			System.out.println(a + " is Odd!!");
		}
		sc.close();
	}

}
