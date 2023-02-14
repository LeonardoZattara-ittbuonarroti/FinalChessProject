public class Bishop implements ChessPiece{
    private int currentX;
    private int currentY;

    public Bishop(){
        currentX = 2;
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
