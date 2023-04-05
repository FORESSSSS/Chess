public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkCage(toLine, toColumn) && ((line == toLine && column != toColumn) || (line != toLine && column == toColumn))
                && checkStraightWay(chessBoard, line, column, toLine, toColumn)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkStraightWay(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if ((line == toLine && column != toColumn)) {
            for (int i = 1; i < Math.abs(column - toColumn); i++) {
                if (chessBoard.board[line][Math.min(column, toColumn) + i] != null) {
                    return false;
                }
            }
        } else if ((line != toLine && column == toColumn)) {
            for (int i = 1; i < Math.abs(line - toLine); i++) {
                if (chessBoard.board[Math.min(line, toLine) + i][column] != null) {
                    return false;
                }
            }
        }
        if (chessBoard.board[toLine][toColumn] != null && color.equals(chessBoard.board[toLine][toColumn].getColor())) {
            return false;
        } else {
            return true;
        }
    }
}