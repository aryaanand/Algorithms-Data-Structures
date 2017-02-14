package com.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		System.out.println(orderWeight("56 65 74 100 99 68 86 180 90"));

	}

	public static String orderWeight(String strng) {
		// your code
		String[] input = strng.split(" ");
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		for (String str : input) {
			int sum = 0;
			for (int i = 0; i < str.length(); i++) {
				sum += Integer.parseInt(String.valueOf(str.charAt(i)));
				
			}
			hmap.put(str, sum);
	//		System.out.println( hmap.get(str));
		}
		String output = "";

		for (int i = 0; i < input.length; i++) {
			int ind = i;
			for (int j = i + 1; j < input.length; j++)
				if (hmap.get(input[j]) < hmap.get(input[ind]))
					ind = j;
			int small = hmap.get(input[ind]);
		//	System.out.println( hmap.get(input[ind]));
			hmap.put(input[ind], hmap.get(input[i]));
			hmap.put(input[i], small);
			
			
		}
		for (int i = 0; i < input.length; i++) {
			output = String.valueOf(hmap.get(input[i]));
			output += " ";
		}
		return output.substring(0,output.length()-1);
	}
}
