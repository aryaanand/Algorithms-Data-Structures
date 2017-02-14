package com.hackerrank;

import java.util.Scanner;

public class Sorting1 {

	public static void insertIntoSorted(int[] arr) {
        // Fill up this function  
        
        int size = arr.length;
       
        int temp = arr[size-1];
        int i = 0;
		for (i = size - 2; i >= 0; i--) {
			if (arr[i] > temp) {
				arr[i + 1] = arr[i];
				for (int j = 0; j < size; j++)
					System.out.print(arr[j] + " ");
				System.out.println("");
			} else {
				arr[i + 1] = temp;
				break;
			}
		}
		if (i == -1)
			arr[i+1] = temp;
        
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
        printArray(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
