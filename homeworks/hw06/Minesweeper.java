import java.util.Scanner;

public class Minesweeper {
    public static void welcomeMessage() {
        System.out.println("Welcome to Minesweeper!");
    }

    public static void printCoveredBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(". ");
            }
            System.out.println();
        }
    }

    public static boolean isValidInput(String input, int boardSize) {
        try {
            int num = Integer.parseInt(input);
            return num >= 0 && num < boardSize;
        } catch (NumberFormatException e) {
            return false;
        }
    }

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

        welcomeMessage();
        printCoveredBoard(board);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int uncoveredCells = 0;
            for (int[] row : board) {
                for (int cell : row) {
                    if (cell != -1) {
                        uncoveredCells++;
                    }
                }
            }
            if (uncoveredCells == boardSize * boardSize) {
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
                System.out.println("You hit a BOMB! You lose!");
                break;
            } else {
                board[row][col] = 1;
                Board.display(board);
            }
        }

        System.out.println("Game Over!");
        Board.display(board);

        scanner.close();
    }
}

