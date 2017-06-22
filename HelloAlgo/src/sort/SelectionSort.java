package sort;

public class SelectionSort {
	
	int[] arr;
	
	SelectionSort(int[] arr){
		this.arr = arr;
	}
	
	public void sorting(){
		for(int i = 0; i < arr.length; i++){
			int min = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[min] > arr[j]){
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	

}
