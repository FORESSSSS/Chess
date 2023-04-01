public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "H";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine == line + 2 && toColumn == column + 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (toLine == line + 2 && toColumn == column - 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (toColumn == column + 2 && toLine == line + 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (toColumn == column + 2 && toLine == line - 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (toLine == line - 2 && toColumn == column + 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (toLine == line - 2 && toColumn == column - 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (toColumn == column - 2 && toLine == line + 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (toColumn == column - 2 && toLine == line - 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (toColumn == column && toLine == line) {
            return false;
        } else {
            return false;
        }
    }
}
