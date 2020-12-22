package co.edureka.MyAlgorithms;

import java.util.Scanner;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,6,8,9,12,24};
		System.out.println("Array Elements: ");
		for(int i:arr) {
			System.out.print(i+" | ");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number to be searched:");
		int num=sc.nextInt();
		BinarySearchAlgorithm bs=new BinarySearchAlgorithm();
		int result=bs.binarySearch(arr, 0, arr.length-1, num);
		if(result!=-1) {
			System.out.println("Element Present at Index: "+result);
		}
		else {
			System.out.println("Element Not Present!");
		}
		
	}
	
	int binarySearch(int[] arr,int l,int r,int num) {
		
		if(l>r) {
			return -1;
		}
		
		if(r>=1) {
			int mid=(l+r)/2;
			System.out.println("Mid Val:"+mid);
			System.out.println("l Val:"+l);
			System.out.println("R Val:"+r);
			System.out.println("num Val:"+num);
			if(arr[mid]==num) {
				return mid;
			}
			if(arr[mid]<num){
				return binarySearch(arr,mid+1,r,num);
				
			}
			else {
				return binarySearch(arr,l,mid-1,num);
			}
		}
		else {
			return -1;
		}
		
	}

}
