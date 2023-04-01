public class Queen extends ChessPiece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        for (int i = 1; i <= 7; i++) {
            if (toLine == line && toColumn == column + i && checkCage(toLine, toColumn)) {
                return true;
            } else if (toLine == line && toColumn == column - i && checkCage(toLine, toColumn)) {
                return true;
            } else if (toColumn == column && toLine == line + i && checkCage(toLine, toColumn)) {
                return true;
            } else if (toColumn == column && toLine == line - i && checkCage(toLine, toColumn)) {
                return true;
            } else if (toLine == line + i && toColumn == column + i && checkCage(toLine, toColumn)) {
                return true;
            } else if (toLine == line + i && toColumn == column - i && checkCage(toLine, toColumn)) {
                return true;
            } else if (toLine == line - i && toColumn == column + i && checkCage(toLine, toColumn)) {
                return true;
            } else if (toLine == line - i && toColumn == column - i && checkCage(toLine, toColumn)) {
                return true;
            } else if (toLine == line && toColumn == column) {
                return false;
            }
        }
        return false;
    }
}
