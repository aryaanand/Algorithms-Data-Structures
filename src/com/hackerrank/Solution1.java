package com.hackerrank;

public class Solution1 {

	public static void main(String[] args) {
		System.out.println(isValid("()"));
	}

	public static boolean isValid(String braces) {
		// Add code here
		String openBrac = "";
		for (int i = 0; i < braces.length(); i++) {
			if (!(String.valueOf(braces.charAt(i)).equals("}")
					|| String.valueOf(braces.charAt(i)).equals("]") || String
					.valueOf(braces.charAt(i)).equals(")")))
				openBrac += String.valueOf(braces.charAt(i));

		}
		int j = 0;
		String outputbrac = "";
		for (int i = openBrac.length()-1; i >= 0; i--) {
			if (String.valueOf(openBrac.charAt(i)).equals("("))
				outputbrac += ")";
			else if (String.valueOf(openBrac.charAt(i)).equals("{"))
				outputbrac += "}";
			else if (String.valueOf(openBrac.charAt(i)).equals("["))
				outputbrac += "]";
			
		}
		String closeBrac = "";
		for (int i = 0; i < braces.length(); i++) {
			if (!(String.valueOf(braces.charAt(i)).equals("(")
					|| String.valueOf(braces.charAt(i)).equals("{") || String
					.valueOf(braces.charAt(i)).equals("[")))
				closeBrac += String.valueOf(braces.charAt(i));

		}
		
		return closeBrac.equals(outputbrac);
		

	}
}
