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
        if (checkCage(toLine, toColumn) && checkPosition(line, column, toLine, toColumn)
                && ((Math.abs(line - toLine) == 2 && Math.abs(column - toColumn) == 1) || (Math.abs(line - toLine) == 1 && Math.abs(column - toColumn) == 2))
                && (chessBoard.board[toLine][toColumn] == null || !color.equals(chessBoard.board[toLine][toColumn].getColor()))) {
            return true;
        } else {
            return false;
        }
    }
}