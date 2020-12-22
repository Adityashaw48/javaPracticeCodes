package co.edureka.MyAlgorithms;

public class MergeSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray= {7,12,234,4,46,11,33,45,2};
		System.out.println("Before Sorting");
		for(int n:myArray) {
			System.out.print(n+" ");
		}
		MergeSortAlgo algo=new MergeSortAlgo();
		algo.sort(myArray,0,myArray.length-1);
		System.out.println("-------------");
		System.out.println("After Sorting");
		for(int n:myArray) {
			System.out.print(n+" ");
		}

	}
	
	public void merge(int[] array,int left,int mid,int right) {
	
		int leftSize=mid-left+1;
		int rightSize=right-mid;
		
		int[] leftArray=new int[leftSize];
		int[] rightArray=new int[rightSize];
		
		//Copy the elements into left and Right Array
		for(int i=0;i<leftSize;i++) {
			leftArray[i]=array[left+i];
		}
		for(int i=0;i<rightSize;i++) {
			rightArray[i]=array[mid+i+1];
		}
		
		//MERGING
		
		int leftIndex=0;
		int rightIndex=0;
		int index=left;
		
		while(leftIndex<leftSize && rightIndex<rightSize) {
			if(leftArray[leftIndex]<rightArray[rightIndex]) {
				array[index]=leftArray[leftIndex];
				leftIndex++;
			}
			else {
				array[index]=rightArray[rightIndex];
				rightIndex++;
			}
			index++;
		}
		while(leftIndex<leftSize) {
			array[index]=leftArray[leftIndex];
			leftIndex++;
			index++;
		}
		while(rightIndex<rightSize) {
			array[index]=rightArray[rightIndex];
			rightIndex++;
			index++;
		}
	}
	
	public void sort(int[] array,int left,int right) {
		
		if(right>left) {
			int mid=(left+right)/2;
			sort(array,left,mid);
			sort(array,mid+1,right);
			merge(array,left,mid,right);
		}
		
	}

}
