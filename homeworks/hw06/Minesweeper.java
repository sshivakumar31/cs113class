import java.util.Scanner;

/**
 * Represents the Minesweeper game.
 */
public class Minesweeper {
    /**
     * Displays a welcome message to the user.
     */
    public static void welcomeMessage() {
        System.out.println("Welcome to Minesweeper!");
    }

    /**
     * Prints the board to the console.
     *
     * @param board   The 2D array representing the game board.
     * @param display The 2D array representing which cells are currently displayed to the user.
     */
    public static void display(int[][] board, boolean[][] display) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (display[i][j]) {
                    if (board[i][j] == -1) {
                        System.out.print("X ");
                    } else {
                        System.out.print(board[i][j] + " ");
                    }
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Checks if all non-bomb cells have been uncovered.
     *
     * @param board   The 2D array representing the game board.
     * @param display The 2D array representing which cells are currently displayed to the user.
     * @return true if all non-bomb cells have been uncovered, false otherwise.
     */
    public static boolean uncovered(int[][] board, boolean[][] display) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (!display[i][j] && board[i][j] != -1) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks if the input is a valid integer within the range [0, boardSize).
     *
     * @param input     The input string to be validated.
     * @param boardSize The size of the game board.
     * @return true if the input is a valid integer within the specified range, false otherwise.
     */
    public static boolean isValidInput(String input, int boardSize) {
        try {
            int num = Integer.parseInt(input);
            return num >= 0 && num < boardSize;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Main method for the Minesweeper game.
     *
     * @param args Command-line arguments (expects a file name).
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a file");
            return;
        }

        String fileName = args[0];
        int[][] board = Board.generate(fileName);
        if (board == null) {
            return;
        }
        int boardSize = board.length;
        boolean[][] display = new boolean[boardSize][boardSize];

        welcomeMessage();
        display(board, display);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (uncovered(board, display)) {
                System.out.println("You WIN!!");
                break;
            }

            System.out.print("Enter a row: ");
            String rowInput = scanner.nextLine();
            if (!isValidInput(rowInput, boardSize)) {
                System.out.println("Please enter an integer in range [0, " + (boardSize - 1) + ")");
                continue;
            }
            int row = Integer.parseInt(rowInput);

            System.out.print("Enter a col: ");
            String colInput = scanner.nextLine();
            if (!isValidInput(colInput, boardSize)) {
                System.out.println("Please enter an integer in range [0, " + (boardSize - 1) + ")");
                continue;
            }
            int col = Integer.parseInt(colInput);

            if (board[row][col] == -1) {
                display[row][col] = true;
                display(board, display);
                System.out.println("You hit a BOMB! You lose!");
                break;
            } else {
                display[row][col] = true;
                display(board, display);
            }
        }

        System.out.println("Game Over!");
        display(board, display);
        scanner.close();
    }
}

