package problems;

import com.practice.MyMergeSort;

public class Topcoder2 {

	public static void main(String[] args) {

		int[] inputArr = { 3, 8, 4, 5, 6, 2, 2 };
		int[] diff = null;
		int[] count = null;

		MyMergeSort mms = new MyMergeSort();
		mms.sort(inputArr);

		for (int i = 0; i < inputArr.length - 1; i++) {

			diff[i] = inputArr[i + 1] - inputArr[i];

		}

		for (int i = 0; i < diff.length - 1; i++) {

		 
		}
	}
}
