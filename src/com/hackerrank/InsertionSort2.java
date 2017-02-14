package com.hackerrank;

public class InsertionSort2 {

	public static void main(String[] args) {

		int[] arr = { 4, 1, 3, 5, 6, 2 };
		int n = arr.length;
		//int j = 0;
		for (int i = 1; i < n; i++) {
			int small = arr[i];
			for (int j = i-1; j >= 0; j--) {
				if (arr[j] > small) {
					arr[j + 1] = arr[j];
					if(j == 0) {
						arr[j] = small;
 					}
				} else {
					arr[j + 1] = small;
					break;
				}
			}
			for(int k = 0; k < n; k++)
				System.out.print(arr[k] + " ");
			System.out.println("");
		}
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
}
