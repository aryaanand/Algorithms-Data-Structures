package com.hackerrank;

public class String4 {

	public static void main(String[] args) {
		String s = "Hello_World!";
		int n = s.length();
		int k = 4;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			if ((s.charAt(i) >= 'a' && s.charAt(i) < 'z')
					|| (s.charAt(i) >= 'A' && s.charAt(i) < 'Z')) {
				if ((s.charAt(i) + k) - 'z' < 0 && s.charAt(i) >= 'a')
					sb.append((char) ('a' + (s.charAt(i) + k) - 'z'));
				else
					sb.append((char) (s.charAt(i) + k));
				if ((s.charAt(i) + k) - 'Z' < 0 && s.charAt(i) >= 'A')
					sb.append((char) ('A' + (s.charAt(i) + k) - 'Z'));
				else
					sb.append((char) (s.charAt(i) + k));
			}
				else if (s.charAt(i) == 'z' || s.charAt(i) == 'Z')
					sb.append((char) ('a' + (k - 1)));
				else
					sb.append(s.charAt(i));
		}
		System.out.println(sb.toString());
	}
}
