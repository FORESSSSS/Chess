import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ChessBoard board = new ChessBoard("White");

        board.board[0][0] = new Rook("White");
        board.board[2][0] = new Pawn("White");
        board.printBoard();
        System.out.println(board.board[0][0]);
        System.out.println(board.board[1][0]);
        System.out.println(board.board[0][0].canMoveToPosition(board,0,0,1,0));
        System.out.println(board.board[0][0].move(board,0,0,1,0));
        System.out.println(board.board[0][0].move(board,0,0,2,0));
        System.out.println(board.board[0][0].move(board,0,0,3,0));
    }
}