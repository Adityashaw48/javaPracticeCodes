package co.edureka.Algorithms;

import java.util.Scanner;

public class BinarySearchAlgorithm {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {22,33,44,55,66,77,88,99};
		System.out.println("My Array Elements are:");
		for(int i:array) {
			System.out.print(i+"\t");
		}
		System.out.println("\nEnter the element you want to search:");
		Scanner sc=new Scanner(System.in);
		int elementToBeSearched=sc.nextInt();
		int left=0;
		
		int right=array.length-1;
		System.out.println("left:"+left+" \t Right:"+right);
		
		int index=binarySearch(array,elementToBeSearched,left,right);
		if(index!=-1) {
			System.out.println("Element found at Index: "+index);
		}
		else {
			System.out.println("Element Not Present");
		}
		
		sc.close();
	}

	private static int binarySearch(int[] array, int elementToBeSearched,int left, int right) {
		// TODO Auto-generated method stub
		
		if(right<left) {
			return -1;
		}
		
		int mid=(left+right)/2;
		System.out.println("Mid Point:"+mid);
		
		if(array[mid]==elementToBeSearched) {
			return mid;
		}
		else if(elementToBeSearched<array[mid]) {
			return binarySearch(array,elementToBeSearched,left,mid-1);
		}
		else{
			return binarySearch(array,elementToBeSearched,mid+1,right);
		}
		
	}

}
