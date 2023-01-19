
import java.util.Scanner;

public class TicTacToe {
    private static int computerMove;
    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '},
                          {' ', ' ', ' '},
                          {' ', ' ', ' '}};

        printBoard(board);

        Scanner scanner = new Scanner(System.in);

        placeMove(board, scanner);
        while (true) {
            randomMark();
            if (isMoveAllowed(board, computerMove )) {
                break;
            }
        }
        printBoard(board);
    }

    private static void randomMark() {
        computerMove = (int)(Math.random() * 9) + 1;
    }

    private static boolean isMoveAllowed(char[][] board, int position) {
        switch (position) {
            case 1:
                return (board[0][0] == ' ');
            case 2:
                return (board[0][1] == ' ');
            case 3:
                return (board[0][2] == ' ');
            case 4:
                return (board[1][0] == ' ');
            case 5:
                return (board[1][1] == ' ');
            case 6:
                return (board[1][2] == ' ');
            case 7:
                return (board[2][0] == ' ');
            case 8:
                return (board[2][1] == ' ');
            case 9:
                return (board[2][2] == ' ');
            default:
                return false;
        }
    }
    private static void playerTurn(char[][] board, Scanner scanner) {
        System.out.println("Where would you like to play? (1, 9)");

        String userInput = scanner.nextLine();

        System.out.println(userInput);

        placeMove(board, userInput);
    }

    private static void placeMove(char[][] board, String userInput) {
        switch (userInput) {
            case "1":
                board[0][0] = 'X';
                break;
            case "2":
                board[0][1] = 'X';
                break;
            case "3":
                board[0][2] = 'X';
                break;
            case "4":
                board[1][0] = 'X';
                break;
            case "5":
                board[1][1] = 'X';
                break;
            case "6":
                board[1][2] = 'X';
                break;
            case "7":
                board[2][0] = 'X';
                break;
            case "8":
                board[2][1] = 'X';
                break;
            case "9":
                board[2][2] = 'X';
                break;
            default:
                System.out.println(":(");
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2] );
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2] );
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2] );
    }
}