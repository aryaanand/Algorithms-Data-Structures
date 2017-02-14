package com.practice;

import java.util.HashMap;

public class hashCheck {
	
	public static void main(String[] args) {

	HashMap<String, Integer> check = new HashMap<String,Integer>();
	
	check.put("Name", 2);
	check.put("Name1", 3);
	
	System.out.println(check.get("Name"));
	
	
	
	}
}
