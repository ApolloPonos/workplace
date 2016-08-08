package edu.java.nnp;

public class soru19 {

	public static void main(String[] args) {

	}

	void NNStringArray() {
		tictactoe();
	}

	void tictactoe() {
		String[][] grid = new String[3][3];

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				grid[i][j] = "X";
			}
		}
		printArray(grid);

	}

	void printArray(String[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(" | " + grid[i][j]);
			}
			System.out.println(" | ");
		}

	}
}