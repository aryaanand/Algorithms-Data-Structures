package com.practice;

public class MazeProblem {

	public static void main(String[] args) {

		MazeProblem mz = new MazeProblem();
		int blocks[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 },
				{ 1, 1, 1, 1 } };

		mz.solveMaze(blocks);

	}

	boolean solveMaze(int[][] blocks) {
		int solution[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 },
				{ 0, 0, 0, 0 } };

		if (solveMazeCheck(blocks, 0, 0, solution) == false) {
			return false;
		}
		printSolution(solution);
		return true;

	}

	boolean solveMazeCheck(int[][] blocks, int i, int j, int[][] solution) {
		if (i == 3 && j == 3) {
			solution[i][j] = 1;
			return true;
		}

		if (safeToMove(blocks, i, j) == true) {
			solution[i][j] = 1;

			if (solveMazeCheck(blocks, i + 1, j, solution))
				return true;

			if (solveMazeCheck(blocks, i, j + 1, solution))
				return true;

			solution[i][j] = 0;
			return false;
		}
		return false;
	}

	boolean safeToMove(int[][] blocks, int i, int j) {

		return (i < 4 && i >= 0 && j >= 0 && j < 4 && blocks[i][j] == 1);
	}

	void printSolution(int[][] solution) {
		for (int i = 0; i < 4; i++) {
			 System.out.println("");
			for (int j = 0; j < 4; j++) {
				System.out.print(solution[i][j] + " ");
			}
		}

	}

}
