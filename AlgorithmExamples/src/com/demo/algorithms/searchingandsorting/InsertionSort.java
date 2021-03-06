package com.demo.algorithms.searchingandsorting;

import java.util.Iterator;

public class InsertionSort {

	public static void main(String[] args) {
		
		int arr[] = {12,11,13,5,6};
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(arr);
		
		printArray(arr);
	}

	private void sort(int[] arr) {
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			int key = arr[i];
			int j = i-1;
			
			while (j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
	}
}
