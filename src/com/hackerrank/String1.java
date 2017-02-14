package com.hackerrank;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		String str = in.next();
		StringBuffer st = new StringBuffer();
		boolean check = true;
		while (check) {
			check = false;
			for (int i = 0; i < str.length(); i++) {
				if (i != str.length() - 1
						&& !(str.charAt(i + 1) == str.charAt(i))) {
					st = st.append(str.charAt(i));
				} else if (i == str.length() - 1)
					st = st.append(str.charAt(i));
				else {
					i++;
					check = true;
				}
			}

			str = st.toString();
			st.delete(0, st.length());

		}
		if (str.equals(""))
			System.out.println("Empty String");
		else
			System.out.println(str);
	}
}
