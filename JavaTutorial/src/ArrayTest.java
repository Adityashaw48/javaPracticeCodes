//import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//int n=sc.nextInt();
		int[] marks= {12,23,34,45,567,23};
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i] + "  | ");
		}
		System.out.println("\n");
		/*Enchanced Iteration for collection objects like Array*/
		for(int mark: marks) {
			System.out.println(mark);
		}
		
		//System.out.println(marks[6]);//ArrayIndexutofBoundsException
		
		
		//Array Creation
		 
		int[] arr= new int[5];
		
		for(int mark: arr) {
			System.out.println(mark);
		}
		//Default value of int,long,short,byte is 0
		//Default Value of float,double is 0.00
		
		//Default Value of char is blank '\u0000'
		char[] arr1= new char[2];
		
		for(char mark: arr1) {
			System.out.println(mark);
		}
		
		//Default Value of object/String is Null
		String[] arr2= new String[2];
		
		for(String mark: arr2) {
			System.out.print(mark + " | ");
		}
	}

}
