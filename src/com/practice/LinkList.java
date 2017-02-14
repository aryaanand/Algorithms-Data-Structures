package com.practice;

public class LinkList {

	NodeLL head = null;
	NodeLL curr = null;
	NodeLL tempLL = null;
	NodeLL temp = null;
	NodeLL firstElement = null;

	void insert(int data) {

		curr = head;

		NodeLL currNode = new NodeLL(data);

		if (head == null) {
			head = currNode;
			curr = head;

		} else {
			while (curr.link != null) {
				curr = curr.link;
			}
			curr.link = currNode;
		}
	}
	
	void isCircularLinkedList() {
		curr = head;
		while(curr.link != null) {
			curr = curr.link;
		}
		curr.link = head;
	}

	void display() {
		int count = 0;
		while (head != null && count < 4) {
			System.out.println(head.data);
			head = head.link;
			count++;
		}
		System.out.println("Count::" + count);
	}

	void removeDuplicate() {
		curr = head;
		while (curr != null) {
			tempLL = curr.link;
			temp = curr;

			while (tempLL != null) {
				// System.out.println(head.data);

				if (curr.data == tempLL.data) {
					tempLL = tempLL.link;
					temp.link = tempLL;
				} else {
					tempLL = tempLL.link;
					temp = temp.link;
				}
			}
			curr = curr.link;
		}
	}

	void findNthElement(int n) {
		int count = 0;
		curr = head;

		while (head != null) {
			// System.out.println(head.data);
			head = head.link;
			count++;
		}

		for (int i = 0; i < count - n - 1; i++) {
			curr = curr.link;
		}

		System.out.println(curr.data);
	}

	public NodeLL deleteNodeInMiddle(int n) {
		curr = head;
		tempLL = curr.link;

		while (tempLL != null) {
			if (tempLL.data == n) {
				curr.link = tempLL.link;
			}
			tempLL = tempLL.link;
			curr = curr.link;
		}
		return head;
	}

	public void insertIntoCircularLinkedList(int data) {

		curr = head;
		firstElement = head;

		NodeLL currNode = new NodeLL(data);

		if (head == null) {
			head = currNode;
			curr = head;

		} else {
			while (curr.link != null) {
				curr = curr.link;
			}
			curr.link = currNode;
			currNode.link = null;
		}

	}

	public void reverseLinkedList() {
		temp = null;
		curr = head;
		
		//tempLL = head.link.link;
//		if(tempLL.link == null) {
//			temp.link = curr;
//			curr = temp;
//			temp = tempLL;
//			tempLL = tempLL.link;
//		}
			
		while(curr != null) {
			tempLL = curr.link;
			curr.link = temp;
			temp = curr;
			curr = tempLL;
			
		}
		head = temp;
	}
	
	public void reverseCircularLinkedList() {
		curr = head.link;
		temp = head.link.link;
		int count = 0;
		while(curr != null && count < 4) {
			curr.link = head;
			head = curr;
			curr = temp;
			temp = temp.link;
			count++;
		}
	}
	
	public static void main(String[] args) {
		LinkList ll = new LinkList();
		LinkList l2 = new LinkList();
		LinkList l3 = new LinkList();
		ll.insert(5);
		ll.insert(3);
		ll.insert(2);
		ll.insert(4);
		ll.isCircularLinkedList();
		// ll.insert(1);
		// ll.insert(6);
		// ll.removeDuplicate();
		// ll.findNthElement(3);
		// ll.deleteNodeInMiddle(3);
		l2.insert(1);
		l2.insert(6);
		l2.insert(7);
		// l2.display();
		ll.reverseCircularLinkedList();
		 ll.display();
		int data = 0;
		while (ll.head != null && l2.head != null) {

			data = ll.head.data + l2.head.data;
			l3.insert(data);
			ll.head = ll.head.link;
			l2.head = l2.head.link;
		}
		//l3.display();
		LinkList cl = new LinkList();
		cl.insertIntoCircularLinkedList(1);
		cl.insertIntoCircularLinkedList(2);
		cl.insertIntoCircularLinkedList(3);
		cl.insertIntoCircularLinkedList(4);
		//cl.display();
		
		
	}

}
