package com.demo.algorithms.searchingandsorting;

public class BinarySearchIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchIterative binarySearchIterative= new BinarySearchIterative();
		int arr[] = {2,3,4,10,40,55,60,70,88};
		int x = 10;
		
		int result = binarySearchIterative.binarySearch(arr,x);
		if (result == -1) {
			System.out.println("Element is not present in the array");
		}
		else {
			System.out.println("Element is present in the array at index position "+result);
		}
	}

	private int binarySearch(int[] arr, int x) {
		int l = 0, r = arr.length - 1;
		while(l <= r) {
			int m = l +(r - l)/2;
			
			// check if x is present at mid
			if (arr[m] == x) {
				System.out.println("m = "+m);
				return m;
			}
			// If x is greater ignore left half
			if (arr[m] < x) {
				l = m + 1;
				System.out.println("l = "+l);
			}
			// if x is smaller ignore the right part
			else {
				r = m-1;
				System.out.println("r = "+r);
			}
		}
		System.out.println("End....");
		return -1;
	}

}
