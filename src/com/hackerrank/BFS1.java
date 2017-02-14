package com.hackerrank;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS1 {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int k = 0; k < q; k++) {
			int nodes = in.nextInt();
			int edges = in.nextInt();
			LinkedList<Integer> edge_list[] = new LinkedList[nodes];
			for (int i = 0; i < nodes; i++)
				edge_list[i] = new LinkedList<Integer>();
			for (int i = 0; i < edges; i++)
				edge_list[in.nextInt() - 1].add(in.nextInt() - 1);
			int startNode = in.nextInt() - 1;
			boolean visited[] = new boolean[nodes];
			visited[startNode] = true;

			
			Queue<Integer> queue = new LinkedList<Integer>();
			queue.add(startNode);
			int edgeLevel[] = new int[nodes];
			for (int i = 0; i < nodes; i++)
				edgeLevel[i] = -1;
			
			int edgesL = 1;

			while (queue.size() != 0) {
				int node = queue.poll();
				Iterator<Integer> i = edge_list[node].listIterator();
				while (i.hasNext()) {
					int n = i.next();
					visited[n] = true;
					edgeLevel[n] = 6*edgesL;
					queue.add(n);
				}
				edgesL++;
			}
			for (int j = 0; j < nodes; j++) {
				if (j != startNode) {
						System.out.print(edgeLevel[j] + " ");
				}
			}
			System.out.println("");
		}
	}
}
