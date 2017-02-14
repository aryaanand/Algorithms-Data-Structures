package com.hackerrank;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class ArrayLast {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		int lastAns = 0;
		int seq = 0;
		int value = 0;
		int seq1 = 0;
		Vector<Integer> vc = vc = new Vector<Integer>();
		Vector<Integer> vc1 = vc = new Vector<Integer>();
		Vector<Vector<Integer>> st = new Vector<Vector<Integer>>();
		st.add(0,vc);
		st.add(1,vc1);
		Vector vct;

		for (int i = 0; i < q; i++) {
			int a = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();

			if (a == 1) {
				seq = (x ^ lastAns) % n;
//				if (i == 0)
//					vc = new Vector<Integer>();
//				else
				vct = st.get(seq);
				vct.add(y);
				st.add(seq, vc);
			} else if (a == 2) {
				seq1 = (x ^ lastAns) % n;
				int size = st.get(seq1).size();
				value = y % size;
				lastAns = st.get(seq1).get(value);
			}
			if (lastAns != 0)
				System.out.println(lastAns);
		}
	}
}