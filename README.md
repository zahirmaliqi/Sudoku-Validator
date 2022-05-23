# Sudoku-Validator

Sudoku is a logic-based puzzle that uses combinatorial-number placement. In a classic Sudoku puzzle,
the task is to fill the numbers in a 9 x 9 grid laced in such a way that each row, each column, and 
each of the sub-grid of the size 3 x 3 contains all the numbers from 1 to 9 (1 and 9 inclusive).

* Each row contains unique values from 1-9.
* Each column contains unique values from 1-9.
* Each of the 9 sub-squares, of size 3x3, contains a unique value from 1-9.

## Instructions to run the application

1. Download the zip file from GitHub found [here](https://github.com/zahirmaliqi/Sudoku-Validator) and after that, extract it.
2. Open terminal (Command Prompt).
3. Using ``` 'cd' ``` - navigate to the directory where sv.java is.

   ```sh 
   cd Downloads 
   ```
   ```sh
   cd Sudoku-Validator-main 
   ```
   ```sh
   cd Sudoku-Validator-main 
   ```
   ```sh
   cd src
   ```
4. Then, enter the following command to reads files and complies them into class files.

   ```sh 
   javac *.java
   ```
5. Using ``` 'cd ..' ``` will move you up one directory.
   ```sh 
   cd .. 
   ```
6. Now, run with: 
   ```sh
   java -classpath . src.sv [file-name]
    ```
    example
    ```sh
   java -classpath . src.sv rowError
    ```
 
   
   
