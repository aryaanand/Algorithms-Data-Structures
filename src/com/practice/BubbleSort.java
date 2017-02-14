package com.practice;

/**
 * O(n^2)
 * @author aryaanand
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr  = {5,3,4,2,1,6};
		int n = arr.length;
		int temp;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 1; j < (n-i); j++) {
				if (arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
}
