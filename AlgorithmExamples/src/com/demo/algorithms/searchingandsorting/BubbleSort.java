package com.demo.algorithms.searchingandsorting;

public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();

		int arr[] = {10,34,22,58,18,26,5};
		System.out.println("Sorted Array...");
		bs.printArray(arr);
		bs.bubbleSort(arr);
		System.out.println("\nSorted Array...");
		bs.printArray(arr);
	}

	private void printArray(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

	private void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
