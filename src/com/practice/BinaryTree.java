package com.practice;

public class BinaryTree {

	public static Node root;
	public static int leftHeight = 0;
	public static int rightHeight = 0;

	public void insert(int data) {

		Node node = new Node(data);

		if (root == null) {
			root = node;
			return;
		}

		insertNode(root, node);

	}

	/**
	 * Determines the minimum depth of a binary tree node.
	 *
	 * @param node
	 *            The node to check.
	 * @return The minimum depth of a binary tree node.
	 */
	private static int minDepth(Node node) {
		if (node == null) {
			return 0;
		}
		return 1 + Math.min(minDepth(node.left), minDepth(node.right));
	}

	/**
	 * Determines the maximum depth of a binary tree node.
	 *
	 * @param node
	 *            The node to check.
	 * @return The maximum depth of a binary tree node.
	 */
	private static int maxDepth(Node node) {
		if (node == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
	}

	public void insertNode(Node latestRoot, Node node) {

		if (latestRoot.data > node.data) {
			if (latestRoot.left == null) {
				latestRoot.left = node;
				return;
			} else
				insertNode(latestRoot.left, node);

		} else if (latestRoot.data < node.data) {
			if (latestRoot.right == null) {
				latestRoot.right = node;
				return;
			} else
				insertNode(latestRoot.right, node);

		}
	}

	private void printInorder(Node node) {

		if (node == null)
			return;

		printInorder(node.left);
		System.out.println(node.data);
		printInorder(node.right);
	}

	private void printPreorder(Node node) {

		if (node == null)
			return;

		System.out.println(node.data);
		printPreorder(node.left);
		printPreorder(node.right);
	}

	private void printPostorder(Node node) {

		if (node == null)
			return;

		printPostorder(node.left);
		printPostorder(node.right);
		System.out.println(node.data);
	}

	private int findMinimumValue(Node node) {

		if (node == null)
			return 0;
		else
			while (node.left != null)
				node = node.left;
		return node.data;
	}

	private int findMaximumValue(Node node) {

		if (node == null)
			return 0;
		else
			while (node.right != null)
				node = node.right;
		return node.data;
	}
	
	public Node sortedArrayToBST(int[] arr, int start, int end) {
		if (start > end)
			return null;
		int mid = (start+end)/2;
		
		Node node = new Node(arr[mid]);
		if (root == null)
			root = node;
		
		node.left = sortedArrayToBST(arr, start, mid-1);
		node.right = sortedArrayToBST(arr, mid+1, end);
		return node;
	}

	public boolean isBalancedTree(Node node) {
		if (node == null)
			return false;
		else {
			System.out.println("Maxdepth ->"+maxDepth(node));
			return (Math.abs(maxDepth(node) - minDepth(node))) <= 1;
		}
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
//		bt.insert(3);
//		bt.insert(4);
//		bt.insert(2);
//		bt.insert(5);

		int[] arr = {2,3,4,5,6,7,8};
		bt.sortedArrayToBST(arr, 0, 6);
		
		System.out.println("Inorder\n");
		bt.printInorder(root);
		System.out.println("Preorder\n");
		bt.printPreorder(root);
		System.out.println("Postorder\n");
		bt.printPostorder(root);

		System.out.println("Minimum Value \n" + bt.findMinimumValue(root));
		System.out.println("Maximum Value \n" + bt.findMaximumValue(root));

		System.out.println(bt.isBalancedTree(root));
	}

}
