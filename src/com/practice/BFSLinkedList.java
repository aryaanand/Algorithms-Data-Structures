package com.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSLinkedList {

	ArrayList al = new ArrayList();

	public void levelOrder(Node root) {
		int h = height(root);
		for(int i = 0; i < h; i++) {
			printlevels(root, i);
			System.out.println("");
		}
	}
	
	public void printlevels(Node root, int h) {
		if(root == null) 
			return;
		if(h ==1)
			System.out.print(" "+root.data);
		else {
			printlevels(root.left, h-1);
			printlevels(root.right, h-1);
		}
	}
	
	public int height(Node root) {
		return 1+ Math.max(height(root.left), height(root.right));
	}
	
	public void levelOrderQueue(Node root) {
		Queue q = new LinkedList();
		int levelNodes = 0;
		if(root == null) 
			return;
		q.add(root);
		while(!q.isEmpty()) {
			levelNodes = q.size();
			NodeLL head = null;
			NodeLL curr = null;
			while(levelNodes > 0) {
				Node n = (Node)q.remove();
				NodeLL ln = new NodeLL(n.data);
				if(head == null) {
					head = ln;
					curr = ln;
				}
				else {
					curr.link = ln;
					curr = curr.link;
				}
				if(n.left != null)
					q.add(n.left);
				if(n.right != null)
					q.add(n.right);
				levelNodes--;
			}
			al.add(head);
		}
		display(al);
	}
	public void display(ArrayList al) {
		Iterator it = al.iterator();
		while(it.hasNext()){
		  NodeLL head = (NodeLL) it.next();
		  //System.out.print("-&gt;" + head.data);
		  while(head!=null){
			  System.out.print("-&gt;" + head.data);
			  head = head.link;
		  }
		  System.out.println("");
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Node root = new Node(5);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.right.left = new Node(30);
		root.right.right = new Node(35);

		BFSLinkedList i  = new BFSLinkedList();
		//i.levelOrder(root);
		i.levelOrderQueue(root);
	}
}
