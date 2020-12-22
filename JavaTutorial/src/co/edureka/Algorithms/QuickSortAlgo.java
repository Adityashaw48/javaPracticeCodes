package co.edureka.Algorithms;

public class QuickSortAlgo {

	public static void main(String[] args) {
		
		int[] array= {8,7,2,1,0,9,6};
		int size=array.length;
		System.out.println("Array Before Sorting:");
		for(int i:array) {
			System.out.print(i+"\t");
		}
		System.out.println("");
		QuickSortAlgo algo=new QuickSortAlgo();
		

	}
	
	public int partition(int[] array,int low,int high) {
		//select your pivot value
		int pivot=array[high];
		int i=low-1;
		
		//put the elements smaller than pivot on the left and 
		//elements higher than pivot on the right
		for(int j=low;j<high;j++) {
			if(array[j]<=pivot) {
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
	
	public void quickSort(int[] array,int low, int high) {
		if(low<high) {
			//select Pivot position and put all elements
			//smaller than pivot to the left and elements
			//higher than pivot to the right
			
			int pivot=partition(array,low,high);
			
			//sort the elements on the left side of the pivot
			quickSort(array,low,pivot-1);
			//sort the elements on the right side of the pivot
			quickSort(array,pivot+1,high);
		}
	}

}
