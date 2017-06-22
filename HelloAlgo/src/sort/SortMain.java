package sort;

public class SortMain {

	public static void print(int[] arr){
		for(int i : arr){
			System.out.print(i+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] data = {1, 5, 4, 3, 2};
		BubbleSort sort = new BubbleSort(data);
		print(data);
		sort.sorting();
		print(data);
		
		System.out.println();
		int[] data2 = {1, 5, 4, 3, 2};
		SelectionSort ssort = new SelectionSort(data2);
		print(data2);
		ssort.sorting();
		print(data2);

	}

}
