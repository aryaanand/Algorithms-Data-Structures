package com.practice;

/**
 * 
 * @author aryaanand
 *Complexity logn
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int item = 5;
		int n = arr.length;
		int index = 0;
		
		int low = 0;
		int high = n-1;
		
		while (high >= low) {
			int middle = (low+high)/2;
			if (arr[middle] == item) {
				index = middle;
				break;
			}
			if (arr[middle] < item) {
				low = middle+1;
			}
			if(arr[middle] > item) {
				high = middle-1;
			}
		} 
		if (high >= low){
			System.out.println("Item found at "+ index);
		}
	}
}
