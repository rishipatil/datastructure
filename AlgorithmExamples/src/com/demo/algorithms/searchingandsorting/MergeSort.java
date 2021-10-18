package com.demo.algorithms.searchingandsorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {12,11,13,7,4,8};
		System.out.println("Given ArrAY....");
		printArray(arr);
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(arr, 0, arr.length-1);
		
		System.out.println("\nSorted Array.....");
		printArray(arr);
	}

	private void sort(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		if (l < r) {
			//find the middle element
			int mid  = 1+(r-l)/2;
			
			// Sort first and second halves
			sort(arr, l, mid-1);
			sort(arr, mid+1, r);
		} 
	}

	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
