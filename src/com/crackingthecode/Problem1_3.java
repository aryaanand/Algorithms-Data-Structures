package com.crackingthecode;

public class Problem1_3 {

	public static void main(String[] args) {

		String str = "abbcdac";
		int n = str.length();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				if (str.charAt(i) == str.charAt(j)) {
					str = str.substring(0, j) + "" + str.substring(j + 1);
					n = str.length();
				}
			}
		}
		System.out.println(str);
	}

}
