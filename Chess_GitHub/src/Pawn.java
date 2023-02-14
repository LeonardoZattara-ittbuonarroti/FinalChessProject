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
        if(isLegal(x, y)){
            currentX = x;
            currentY = y;
        }
        if(firstMove){
            firstMove = false;
        }
    }

    @Override
    public String checkMoves(String[][] board) {
        return null;
    }

    @Override
    public String currentPosition() {
        String result = "The current position of the pawn is: X = "+getCurrentX()+", Y = "+getCurrentY();
        return result;
    }

    private boolean isLegal(int x, int y){
        boolean legal = true;
        if(firstMove){
            if((y-currentY) < 1 || (y-currentY) > 2 || x != currentX){
                legal = false;
            }
        }
        else{
            if((y-currentY) != 1 || x != currentX){
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
