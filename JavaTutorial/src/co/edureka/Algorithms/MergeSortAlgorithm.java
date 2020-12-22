package co.edureka.Algorithms;

public class MergeSortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray= {7,1,13,15,45,12,6,11,33};
		System.out.println("Array Before Sorting");
		for(int i:myArray) {
			System.out.print(i+"\t");
		}
		System.out.println("\n");
		
		MergeSortAlgorithm algo=new MergeSortAlgorithm();
		int[] sortedArray=algo.sort(myArray, 0, myArray.length-1);
		System.out.println("Processing Completed");
		System.out.println("Array After Sorting");
		
		for(int i: sortedArray) {
			System.out.print(i+"\t");
		}

		

	}
	public int[] merge(int[] array, int left, int right, int mid) {
		
		int[] sortedArray=new int[right+1];
		for(int i:array) {
			System.out.print(i+"\t");
		}
		System.out.println("\n Processing Starts here:");
		
		int leftSize=mid-left+1;
		int rightSize=right-mid;
		
		int[] leftArray=new int[leftSize];
		int[] rightArray=new int[rightSize];
		
		//Copy the elements into left and right array
		for(int i=0;i<leftSize;i++) {
			leftArray[i]=array[left+i];
		}
		for(int i=0;i<rightSize;i++) {
			rightArray[i]=array[mid+1+i];
		}
		
		//Merge
		int leftIndex=0;
		int rightIndex=0;
		int index=left;
		
		while(leftIndex<leftSize && rightIndex<rightSize) {
			if(leftArray[leftIndex]<rightArray[rightIndex]) {
				sortedArray[index]=leftArray[leftIndex];
				leftIndex++;
			}
			else {
				sortedArray[index]=leftArray[rightIndex];
				rightIndex++;
			}
			index++;
		}
		//merging remaining elements
		while(leftIndex<leftSize){
			sortedArray[index]=leftArray[leftIndex];
			leftIndex++;
			index++;
		}
		while(rightIndex<leftSize){
			sortedArray[index]=rightArray[rightIndex];
			rightIndex++;
			index++;
		}
		return sortedArray;
		
	}
	
	public int[] sort(int[] array,int left,int right) {
		int[] sortedArray=null;
		
		if(left<right) {
			int mid=(left+right)/2;
			sort(array,left,mid);
			sort(array,mid+1,right);
			merge(array,left,mid,right);
		}
		return sortedArray;
	}

}
