package com.crackingthecode;

public class Problem1_1 {

	public static void main(String[] args) {

		String str = "abcdefg";
		boolean duplicateFound = false;

		int n = str.length();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					duplicateFound = true;
					break;
				} 
			}
		}
		if (duplicateFound == true) {
			System.out.println("Duplicate Found");
		}
		else {
			System.out.println("No Duplicate found");
		}
	}
}
