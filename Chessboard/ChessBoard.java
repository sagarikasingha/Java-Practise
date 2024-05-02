public class ChessBoard {
    private static final int SIZE = 8;
    private Square[][] board;
    private ChessPiece chessPiece;
    public ChessBoard() {
        
        board = new Square[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = new EmptySquare();
                } else {
                    board[i][j] = new ChessSquare(chessPiece);
                }
            }
        }
    }

    // public void move(int x1, int y1, int x2, int y2) {
    //     Square piece = board[x1][y1];
    //     board[x1][y1] = new EmptySquare();
    //     board[x2][y2] = piece;
    // }

    private static class ChessSquare extends Square {
        ChessPiece chessPiece;
        public ChessSquare(ChessPiece chessPiece) {
            super(true);
            this.chessPiece=chessPiece;
        }
        public  ChessPiece getChessPiece(){
            return chessPiece;
        }
    }

    private static class EmptySquare extends Square {
        public EmptySquare() {
            super(false);
        }
    }

    private static class Square {
        private boolean isOccupied;
    
        public Square(boolean isOccupied) {
            this.isOccupied = isOccupied;
        }
        public boolean isOccupied(Square square) {
            return square.isOccupied;
        }

    }
    private boolean gameOver() {
        System.out.println("Game Over");
        return false;        
    }
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        // Add your logic here to allow two players to make moves
        Player player1=new Player("white");
        Player player2=new Player( "black");
        while (!board.gameOver()) {
            
        }
    }
}

   