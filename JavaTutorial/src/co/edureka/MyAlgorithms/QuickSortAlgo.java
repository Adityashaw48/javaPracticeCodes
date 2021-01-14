package co.edureka.MyAlgorithms;

public class QuickSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {8,2,5,1,9,11,3,7};
		int size=array.length;
		QuickSortAlgo obj=new QuickSortAlgo();
		System.out.println("Before Sorting");;
		for(int n:array) {
			System.out.print(n+" ");
		}
		System.out.println("");
		
		obj.quicksort(array, 0, size-1);
		System.out.println("After Sorting");;
		for(int n:array) {
			System.out.print(n+" ");
		}
		System.out.println("");

	}
	
	public int parition(int[] array,int low,int high) {
		int pivot=array[high];
		int i=low-1;
		
		for(int j=low;j<high;j++) {
			if(array[j]<pivot) {
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		
		int temp=array[i+1];
		array[i+1]=array[high];
		array[high]=temp;
		
		return i+1;
	}
	
	public void quicksort(int[] array,int low,int high) {
		if(low<high) {
			int pivot=parition(array,low,high);
			quicksort(array,low,pivot-1);
			quicksort(array,pivot,high);
		}
	}

}
