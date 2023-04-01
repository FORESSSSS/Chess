public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine == line && toColumn == column + 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (toLine == line && toColumn == column - 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (toColumn == column && toLine == line + 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (toColumn == column && toLine == line - 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (toLine == line + 1 && toColumn == column + 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (toLine == line + 1 && toColumn == column - 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (toLine == line - 1 && toColumn == column + 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (toLine == line - 1 && toColumn == column - 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (toColumn == column && toLine == line) {
            return false;
        } else {
            return false;
        }
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (!color.equals(board.board[i][j].getColor())) {
                    if (line == i && column == j) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
