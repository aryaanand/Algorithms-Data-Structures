package com.hackerrank;

import java.util.Scanner;

public class String3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		s = s.toLowerCase();
		boolean check = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (s.indexOf(ch) < 0) {
				check = false;
				break;
			}
		}
		if (check)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}
}
