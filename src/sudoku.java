package src;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class sudoku {
	private final String path;

	public sudoku(String path) {
		this.path = path;
	}

	public void isSudokuValid(int[][] sudoku) {

		boolean result = true;

		for (int i = 0; i < 9; i++)
			result &= ValidateRows(0, sudoku);

		for (int i = 0; i < 9; i++)
			result &= ValidateColumns(0, sudoku);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				result &= ValidateBoxes(sudoku, i, j);
			}
		}

		if (result)
			System.out.println("Sudoku is valid");
		else
			System.out.println("Sudoku is not valid");
	}

	private boolean ValidateRows(int row, int[][] sudoku) {
		HashSet<Integer> set = newSet();
		for (int col = 0; col < 9; col++) {
			if (set.contains(sudoku[row][col]))
				set.remove(sudoku[row][col]);
		}
		if (set.size() > 0)
			return false;
		return true;
	}

	private boolean ValidateColumns(int col, int[][] sudoku) {
		HashSet<Integer> set = newSet();
		for (int row = 0; row < 9; row++) {
			if (set.contains(sudoku[row][col]))
				set.remove(sudoku[row][col]);
		}
		if (set.size() > 0)
			return false;
		return true;
	}

	private boolean ValidateBoxes(int[][] sudoku, int row_index, int col_index) {
		HashSet<Integer> set = newSet();
		for (int row = row_index * 3; row < (row_index * 3) + 3; row++) {
			for (int col = col_index * 3; col < (col_index * 3) + 3; col++) {
				if (set.contains(sudoku[row][col]))
					set.remove(sudoku[row][col]);
			}
		}
		if (set.size() > 0)
			return false;
		return true;
	}

	private HashSet<Integer> newSet() {
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		return set;
	}

	public void validate() throws IOException, FileNotFoundException {
		final int ROWS = 9;
		final int COLUMNS = 9;
		int[][] numArray = new int[ROWS][COLUMNS];
		File sudoku_file = new File("..\\Files\\" + path + ".txt");
		if (sudoku_file.exists()) {
			Scanner sc = new Scanner(sudoku_file);
			while (sc.hasNextLine()) {
				for (int i = 0; i < numArray.length; i++) {
					String[] line = sc.nextLine().trim().split("," + " ");
					for (int j = 0; j < line.length; j++) {
						numArray[i][j] = Integer.parseInt(line[j]);
					}
				}
			}
			BufferedReader br = new BufferedReader(new FileReader(sudoku_file));
			String st;

			while ((st = br.readLine()) != null)

				System.out.println(st);

			sudoku sudokuValidator = new sudoku(path);
			sudokuValidator.isSudokuValid(numArray);
		} else {
			System.out.println("This File doesn't exist");
		}

	}

}
