package sort;

public class BubbleSort {
	
	int[] arr;
	
	BubbleSort(int[] arr){
		this.arr = arr;
	}
	
	public int[] sorting(){
		
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 0; j < arr.length-1-i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
}
