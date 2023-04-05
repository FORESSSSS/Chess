public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkCage(toLine, toColumn) && checkPosition(line, column, toLine, toColumn)
                && (Math.abs(line - toLine) == Math.abs(column - toColumn))
                && checkDiagonalWay(chessBoard, line, column, toLine, toColumn)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkDiagonalWay(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line - toLine == column - toColumn) {
            for (int i = 1; i < Math.abs(line - toLine); i++) {
                if (chessBoard.board[Math.min(line, toLine) + i][Math.min(column, toColumn) + i] != null) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < Math.abs(line - toLine); i++) {
                if (chessBoard.board[Math.min(line, toLine) + i][Math.max(column, toColumn) - i] != null) {
                    return false;
                }
            }
        }
        if (chessBoard.board[toLine][toColumn] != null && color.equals(chessBoard.board[toLine][toColumn].getColor())) {
            return false;
        }
        return true;
    }
}