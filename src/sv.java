package src;
import java.io.FileNotFoundException;
import java.io.IOException;

public class sv {

	public static void main(String[] args) throws IOException, FileNotFoundException {
    
		if (args.length == 0 || args[0] == null || args == null) {
			System.out.println("File Arguement is missing");
			System.exit(1);
		} else if (args.length > 1) {
			System.out.println("Invalid Input. Valid Input: [file-name]");
			System.exit(1);
		} else {
			sudoku s1 = new sudoku(args[0]);
			s1.validate();
		}

	}

}
