package com.crackingthecode;

public class Problem1_2 {
	
	public static void main(String[] args) {
		String str = "abcd ";
		int n = str.length();
		StringBuffer strR = new StringBuffer(n);
		int j = 0;
		
		for (int i = n-1; i >= 0; i--) {
		strR.append(str.charAt(i));
		}
		System.out.println(strR.toString());
	}

}
