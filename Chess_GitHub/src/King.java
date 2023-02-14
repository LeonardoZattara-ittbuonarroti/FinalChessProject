public class King implements ChessPiece{
    private int currentX;
    private int currentY;

    public King(){
        currentX = 4;
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

    public int getCurrentX() {
        return currentX;
    }

    public int getCurrentY() {
        return currentY;
    }
}
