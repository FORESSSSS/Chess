public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "P";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (color.equals("White") && toColumn == column && toLine == line + 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (color.equals("White") && toColumn == column && toLine == line + twoWhite(line) && checkCage(toLine, toColumn)) {
            return true;
        } else if (color.equals("Black") && toColumn == column && toLine == line - 1 && checkCage(toLine, toColumn)) {
            return true;
        } else if (color.equals("Black") && toColumn == column && toLine == line - twoBlack(line) && checkCage(toLine, toColumn)) {
            return true;
        } else if (toColumn == column && toLine == line) {
            return false;
        } else {
            return false;
        }
    }

    public int twoWhite(int line) {
        if (isLineOne(line)) {
            return 2;
        } else {
            return 1;
        }
    }

    public int twoBlack(int line) {
        if (isLineSix(line)) {
            return 2;
        } else {
            return 1;
        }
    }

    public boolean isLineOne(int line) {
        if (line == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLineSix(int line) {
        if (line == 6) {
            return true;
        } else {
            return false;
        }
    }
}
