public class Pawn implements ChessPiece{
    private int currentX;
    private int currentY;
    private boolean firstMove;

    public Pawn(){
        currentX = 0;
        currentY = 6;
        firstMove = true;
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

    public int getCurrentX() {
        return currentX;
    }

    public int getCurrentY() {
        return currentY;
    }
}
