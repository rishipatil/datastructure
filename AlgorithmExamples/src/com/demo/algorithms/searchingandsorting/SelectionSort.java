package com.demo.algorithms.searchingandsorting;

import java.util.Iterator;

public class SelectionSort {

	
	
	// Time complexity is O(n^2) as there are two nested loops
	// Auxilary space : O(1)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SelectionSort selectionSort = new SelectionSort();
		
		int arr[] = {64,25,22,12,11};
		selectionSort.sort(arr);
		
		System.out.println("Sorted Array...");
		selectionSort.display(arr);
	}

	private void display(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

	private void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		// One by one move boundry of unsorted array
		for (int i = 0; i < n-1; i++) {
			//find the minimum element in the array
			
			int min_idx = i;
			for (int j = i+1; j < n; j++) 
				if (arr[j]<arr[min_idx]) 
					min_idx = j;
			
			//swap the found minimum element with the first element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

}
