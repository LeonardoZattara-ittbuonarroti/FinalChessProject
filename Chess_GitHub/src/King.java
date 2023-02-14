public class King implements ChessPiece{
    private int currentX;
    private int currentY;

    public King(){
        currentX = 4;
        currentY = 7;
    }

    @Override
    public void move(int x, int y) {
        if(isLegal(x, y)){
            currentX = x;
            currentY = y;
        }
    }

    @Override
    public String checkMoves(String[][] board) {
        return null;
    }

    @Override
    public String currentPosition() {
        String result = "The current position of the king is: X = "+getCurrentX()+", Y = "+getCurrentY();
        return result;
    }

    private boolean isLegal(int x, int y){
        boolean legal = true;
        if((x-currentX)*(x-currentX) > 1 || (y-currentY)*(y-currentY) > 1){
            legal = false;
        }
        if(legal){
            if((x-currentX) == 0 && (y-currentY) == 0){
                legal = false;
            }
        }
        if(legal){
            if(x>7 || x<0){
                legal = false;
            }
            else if(y>7 || y<0){
                legal = false;
            }
        }
        return legal;
    }

    public int getCurrentX() {
        return currentX;
    }

    public int getCurrentY() {
        return currentY;
    }
}
