//HW06

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * This class generates and displays a Minesweeper board.
 */

class Board {

    /**
     * Generates a Minesweeper board based on the contents of the specified file.
     *
     * @param fileName The name of the file containing the board layout.
     * @return A 2D array representing the generated board.
     */

    public static int[][] generate(String fileName) {
        int[][] board = null;
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            int rows = 0;
            int cols = 0;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                rows++;
                String[] cells = line.split(" "); // Split by space to count cells
                cols = cells.length;
            }
            board = new int[rows][cols];
            fileScanner.close();
            fileScanner = new Scanner(new File(fileName));
            for (int i = 0; i < rows; i++) {
                String line = fileScanner.nextLine();
                String[] cells = line.split(" "); // Split by space to get individual cells
                for (int j = 0; j < cols; j++) {
                    if (cells[j].equals("X")) { // Check individual cell for bomb
                        board[i][j] = -1; // Bomb
                    } else {
                        board[i][j] = 0; // Empty cell
                    }
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        return board;
    }
    
    /**
     * Displays the Minesweeper board to the console.
     *
     * @param board The 2D array representing the board.
     */
    public static void display(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                if (cell == -1) {
                    System.out.print("X ");
                } else {
                    System.out.print(cell + " ");
                }
            }
            System.out.println();
        }
    }

     /**
     * Main method to read the file name from command line arguments, generate the board, and display it.
     *
     * @param args Command line arguments containing the file name.
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a file");
            return;
        }

        String fileName = args[0];
        int[][] board = generate(fileName);
        if (board == null) {
            return;
        }
        display(board);
    }
}

