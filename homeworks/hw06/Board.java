//April 1st, 2024
//HW 06 Board.java



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



class Board {
    public static int[][] generate(String fileName) {
        // todo: generate board by parsing the file that contains the board
        int[][] board = null;
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            int rows = 0;
            int cols = 0;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                rows++;
                cols = line.length();
            }
            board = new int[rows][cols];
            fileScanner.close();
            fileScanner = new Scanner(new File(fileName));
            for (int i = 0; i < rows; i++) {
                String line = fileScanner.nextLine();
                for (int j = 0; j < cols; j++) {
                    if (line.charAt(j) == 'X') {
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

    public static void display(int[][] board) {
        // todo: display board to console
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

    public static void main(String[] args) {
        // call generate and display
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

