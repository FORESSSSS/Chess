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

        for (int i = 1; i <= 7; i++) {
            if (toLine == line && toColumn == column + i && checkCage(toLine, toColumn)/*&&move(chessBoard, line, column, toLine,toColumn)*/) {
                return true;
            } else if (toLine == line && toColumn == column - i && checkCage(toLine, toColumn)/*&&move(chessBoard, line, column, toLine,toColumn)*/) {
                return true;
            } else if (toColumn == column && toLine == line + i && checkCage(toLine, toColumn)/*&&move(chessBoard, line, column, toLine,toColumn)*/) {
                return true;
            } else if (toColumn == column && toLine == line - i && checkCage(toLine, toColumn)/*&&move(chessBoard, line, column, toLine,toColumn)*/) {
                return true;
            } else if (toColumn == column && toLine == line) {
                return false;
            }
        }
        return false;
    }

    public boolean move(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        for(int i =1;i<8;i++){
            for(int j = 1;j<8;j++){



        if (chessBoard.board[toLine][toColumn] == null){
            return true;
        } else if(chessBoard.board[toLine][toColumn] != null
    && !chessBoard.board[toLine][toColumn].getColor().equals(chessBoard.board[line][column].getColor())){
            return true;
        } else if(chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine+i][toColumn+j] == null){
        return false;
        }else{
        return false;
        }
    }}
    return false;
    }
}
