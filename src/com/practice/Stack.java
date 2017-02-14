package com.practice;

public class Stack {

	NodeLL top = null;
	NodeLL curr = null;
	
	public NodeLL pop() {
		if (top != null) {
			Object item = top.data;
			top = top.link;
			return top;
		}
		return null;
	}
	
	public void push(int data) {
		NodeLL t = new NodeLL(data);
		t.link = top;
		top = t;		
	}
	
	void display() {
		int count = 0;
		while (top != null) {
			System.out.println(top.data);
			top = top.link;
			count++;
		}
		System.out.println("Count::" + count);
	}
	
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.pop();
		st.display();
	}
	
}
