package com.demo.algorithms.searchingandsorting;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchRecursive binarySearchIterative= new BinarySearchRecursive();
		int arr[] = {2,3,4,10,40,55,60,70,88};
		int x = 10;
		int n = arr.length;
		int result = binarySearchIterative.binarySearchRecursive(arr,0, n-1,x);
		if (result == -1) {
			System.out.println("Element is not present in the array");
		}
		else {
			System.out.println("Element is present in the array at index position "+result);
		}
	}

	private int binarySearchRecursive(int[] arr, int l, int r, int x) {
		
		if (r>=l) {
			int m = l + (r-l)/2;
			
			//if the element is present at hte middle itself
			if (arr[m] == x) {
				return m;
			}
			// if the element is smaller than x
			if (arr[m]> x) {
				return binarySearchRecursive(arr, l, m-1, x);
			}
			else
				return binarySearchRecursive(arr, m+1, r, x);
		}	
		return -1;
	}
}
