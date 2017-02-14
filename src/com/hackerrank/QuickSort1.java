package com.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort1 {
	static void partition(int[] ar) {
		ArrayList<Integer> alLeft = new ArrayList<Integer>();
		ArrayList<Integer> alRight = new ArrayList<Integer>();

		int pivot = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] < pivot)
				alLeft.add(ar[i]);
			else
				alRight.add(ar[i]);
		}
		int i = 0;
		int j = 0;
		int k = 0;
		for (i = 0; i < alLeft.size(); i++)
			ar[i]=alLeft.get(i);
		ar[i] = pivot;
		for (j = i+1, k = 0; k < (ar.length-alLeft.size()-1); j++,k++)
			ar[j]=alRight.get(k);
	}
	

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		partition(ar);
		printArray(ar);
	}
}
