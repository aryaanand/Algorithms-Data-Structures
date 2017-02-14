package com.crackingthecode;

import java.util.HashMap;

public class Problem1_4 {

	public static void main(String[] args) {

		String str = "Madam Curie";
		String str1 = "Radium cami";
		int count = 0;
		int instan = 0;
		boolean check = false;
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();

		int n = str.length();

		if (str.length() != str1.length())
			System.out.println("Strings are not anagrams");

		else {
			for (int i = 0; i < n; i++) {
				count = 0;
				for (int j = 0; j < n; j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
						instan = count;
						hm.put(str.charAt(i), instan);
						instan = 0;
						count = 0;
						if (str1.charAt(i) == str1.charAt(j)) {
							count++;
							instan = count;
							hm1.put(str.charAt(i), instan);
						}
					}
				}
			}
			check = hm.equals(hm1);
		}
		
		for (Character key : hm.keySet()) {
		    System.out.println(key + " " + hm.get(key));
		}
//		for (Character key : hm1.keySet()) {
//		    System.out.println(key + " " + hm1.get(key));
//		}
		System.out.println(check);
	}

}
