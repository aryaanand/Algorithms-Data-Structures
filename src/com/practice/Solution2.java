package com.practice;

public class Solution2 {
	public static int solution(String S) {
		// write your code in Java SE 8

		int count = 0;
		int count1 = 0;
		int partition = 1;

		while (partition < S.length()) {
			for (int i = 0; i < partition; i++) {
				if (S.charAt(i) == '(')
					count++;
			}
			for (int j = partition; j < S.length() - 1; j++) {
				if (S.charAt(j) == ')')
					count1++;
			}
			if(count == count1)
				break;
			partition++;
			count = 0;
			count1 = 0;
		}
		return partition;
	}

	public static void main(String[] args) {
		String s = "(())))(";
		solution(s);
	}
}
