package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Solution {

	static String[] friendlyWords(String[] input) {
		if (input == null)
			return null;
		String[] stx = null;
		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<String> ax = new ArrayList<String>();
		Set<String> sths = new HashSet<String>();
		for (String s : input) {
			
			ar.add(s);
			for (String st : input) {

				if (s.length() == st.length()) {
					int i = 0;
					for (i = 0; i < s.length(); i++) {
						if (!st.contains(String.valueOf(s.charAt(i)))) {
							break;
						}
					}
					if (i == s.length())
						ar.add(st);

				}
			}
			sths.clear();
			sths.addAll(ar);
			ar.clear();
			ar.addAll(sths);
			if (ar.size() > 1)
				for (int i = 0; i < ar.size(); i++) {
				//	System.out.print(ar.get(i) + " ");
					
					ax.add(ar.toString()+"\n");
				}
			ar.clear();
		}
		sths.clear();
		sths.addAll(ax);
		ax.clear();
		ax.addAll(sths);
		Object[] obj = ax.toArray();
		String[] stx1 = Arrays.copyOf(obj, obj.length,String[].class);
		
		return stx1;
	}

	public static void main(String[] args) {
		String[] input = { "car", "cheating", "dale", "deal", "lead", "listen",
				"silent", "teaching" };
		for(String s: friendlyWords(input) ) {
			System.out.println(s);
			
		}
	}
}