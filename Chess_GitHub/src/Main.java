public class Main {
    public static void main(String[] args) {
        String[][] board = new String[8][8];
        Bishop b = new Bishop();
        String out = "";

        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                board[i][j] = "0";
            }
        }

        board[b.getCurrentY()][b.getCurrentX()] = "B";

        for(int i=0; i<8; i++){
            out = out+"\n";
            for(int j=0; j<8; j++){
                out = out+board[i][j]+"  ";
            }
        }

        System.out.println(out);

        b.move(1, 6);
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                board[i][j] = "0";
            }
        }
        board[b.getCurrentY()][b.getCurrentX()] = "B";
        out = "";
        for(int i=0; i<8; i++){
            out = out+"\n";
            for(int j=0; j<8; j++){
                out = out+board[i][j]+"  ";
            }
        }
        System.out.println(out);
    }
}