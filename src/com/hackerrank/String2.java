package com.hackerrank;

public class String2 {

	public static void main(String[] args) {
		String s = "saveChangesInTheEditor";
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(String.valueOf(s.charAt(i)).matches("[A-Z")) {
				count++;
			}
			System.out.println(count+1);
		}
	}
}
