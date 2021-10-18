package com.demo.algorithms.searchingandsorting;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60,70};

		int x = 30;
		
		// function call
		int result = linearSearch(arr, x);
		if (result == -1) {
			System.out.println("Element is not present in the array....");
		}
		else {
			System.err.println("Element is present in the array at the index postion : "+ result);
		}
	}

	private static int linearSearch(int[] arr, int x) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
