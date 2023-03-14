public class Main {
    public static void main(String[] args) {
        String[][] board = new String[8][8];
        Bishop b = new Bishop();
        Rook r = new Rook();
        Knight k = new Knight();
        Queen q = new Queen();
        King kg = new King();
        Pawn p = new Pawn();
        String out = "";

        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                board[i][j] = "0";
            }
        }

        board[b.getCurrentY()][b.getCurrentX()] = "B";
        board[r.getCurrentY()][r.getCurrentX()] = "R";
        board[kg.getCurrentY()][kg.getCurrentX()] = "K";
        board[p.getCurrentY()][p.getCurrentX()] = "P";

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
        board[r.getCurrentY()][r.getCurrentX()] = "R";
        board[kg.getCurrentY()][kg.getCurrentX()] = "K";
        board[p.getCurrentY()][p.getCurrentX()] = "P";
        out = "";
        for(int i=0; i<8; i++){
            out = out+"\n";
            for(int j=0; j<8; j++){
                out = out+board[i][j]+"  ";
            }
        }
        System.out.println(out);
        System.out.println("Mossa dell'alfiere eseguita con successo");

        b.move(1, 6);
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                board[i][j] = "0";
            }
        }
        board[b.getCurrentY()][b.getCurrentX()] = "B";
        board[r.getCurrentY()][r.getCurrentX()] = "R";
        board[kg.getCurrentY()][kg.getCurrentX()] = "K";
        board[p.getCurrentY()][p.getCurrentX()] = "P";
        out = "";
        for(int i=0; i<8; i++){
            out = out+"\n";
            for(int j=0; j<8; j++){
                out = out+board[i][j]+"  ";
            }
        }
        System.out.println(out);
        System.out.println("Mossa dell'alfiere fallita");

        p.move(5, 4);
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                board[i][j] = "0";
            }
        }
        board[b.getCurrentY()][b.getCurrentX()] = "B";
        board[r.getCurrentY()][r.getCurrentX()] = "R";
        board[kg.getCurrentY()][kg.getCurrentX()] = "K";
        board[p.getCurrentY()][p.getCurrentX()] = "P";
        out = "";
        for(int i=0; i<8; i++){
            out = out+"\n";
            for(int j=0; j<8; j++){
                out = out+board[i][j]+"  ";
            }
        }
        System.out.println(out);
        System.out.println("Mossa del pedone eseguita con successo");

        p.move(5, 2);
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                board[i][j] = "0";
            }
        }
        board[b.getCurrentY()][b.getCurrentX()] = "B";
        board[r.getCurrentY()][r.getCurrentX()] = "R";
        board[kg.getCurrentY()][kg.getCurrentX()] = "K";
        board[p.getCurrentY()][p.getCurrentX()] = "P";
        out = "";
        for(int i=0; i<8; i++){
            out = out+"\n";
            for(int j=0; j<8; j++){
                out = out+board[i][j]+"  ";
            }
        }
        System.out.println(out);
        System.out.println("Mossa del pedone fallita");

        r.move(0, 0);
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                board[i][j] = "0";
            }
        }
        board[b.getCurrentY()][b.getCurrentX()] = "B";
        board[r.getCurrentY()][r.getCurrentX()] = "R";
        board[kg.getCurrentY()][kg.getCurrentX()] = "K";
        board[p.getCurrentY()][p.getCurrentX()] = "P";
        out = "";
        for(int i=0; i<8; i++){
            out = out+"\n";
            for(int j=0; j<8; j++){
                out = out+board[i][j]+"  ";
            }
        }
        System.out.println(out);
        System.out.println("Mossa della torre eseguita con successo");
    }

}