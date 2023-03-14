public class Queen implements ChessPiece{
    private int currentX;
    private int currentY;

    public Queen(){
        currentX = 3;
        currentY = 7;
    }

    public int getCurrentX() {
        return currentX;
    }

    public int getCurrentY() {
        return currentY;
    }
}
