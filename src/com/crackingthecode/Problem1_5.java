package com.crackingthecode;

public class Problem1_5 {

	public static void replcaeSpace(String s) {
		int indx = 0;
		StringBuffer st = new StringBuffer();
//		if (s.contains(" "))
//			indx = s.indexOf(" ");
//	
//		st.replace(indx, indx+1, "%20");
//		s = st.toString();
//		
		String[] sarr = s.split(" ");
		
		for(String str : sarr) {
			st.append(str);
			st.append("%20");
		}
		
		System.out.println(st.toString().substring(0,st.length()-3));

	}

	public static void main(String[] args) {
		replcaeSpace("My name is Arya Anand");
	}

}
