public class Rook implements ChessPiece{
    private int currentX;
    private int currentY;

    public Rook(){
        currentX = 0;
        currentY = 7;
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public String checkMoves(String[][] board) {
        return null;
    }

    @Override
    public String currentPosition() {
        return null;
    }
}
