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
        if (Math.abs(line - toLine) <= 1 && Math.abs(column - toColumn) <= 1 && !isUnderAttack(chessBoard, toLine, toColumn)
                && (chessBoard.board[toLine][toColumn] == null || !color.equals(chessBoard.board[toLine][toColumn].getColor()))) {
            if (checkCage(toLine, toColumn) && checkPosition(line, column, toLine, toColumn)
                    && (Math.abs(line - toLine) == Math.abs(column - toColumn))) {
                return true;
            } else if (checkCage(toLine, toColumn) && ((line == toLine && column != toColumn) || (line != toLine && column == toColumn))) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chessBoard.board[i][j] != null && !color.equals(chessBoard.board[i][j].getColor())
                        && chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column)) {
                    return true;
                }
            }
        }
        return false;
    }
}