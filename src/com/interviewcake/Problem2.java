package com.interviewcake;

public class Problem2 {

	int index;
	public static void main(String[] args) {
		int[] arr = {1,7,3,4};
		Problem2 pb = new Problem2();
		int[] result = pb.calcResult(arr);
		
		System.out.println("Result -->");
		for (int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
	
	public int[] calcResult(int[] arr) {
		int length = arr.length;
		int[] result = new int[length]; 
		for (int i = 0; i < arr[length-1]; i++) {
			index  = i;
			result[i] = 1;
			for(int j = 0; j<arr[length-1]; j++) {
				if(j != i)
					result[i] *= arr[j];
			}
		}
		return result;
	}
}
