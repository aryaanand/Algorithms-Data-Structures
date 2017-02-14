package com.interviewcake;

import java.util.Arrays;

public class Problem3 {

	public static void main(String[] args) {
		int[] arr = { -10, -20, -30, 1, 5, 2, 4, 3, 6 };

		int n = arr.length;
		int[] brr = new int[n];
		int temp;
		int finalProduct;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int product1 = arr[0] * arr[1] * arr[n-1];
		int product2 = arr[n-1] * arr[n-2] * arr[n-3];
		
		if (product1 < product2) {
			finalProduct = product2;
		}
		else 
			finalProduct = product1;
		System.out.println(finalProduct);
		
	}
}
