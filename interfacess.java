
public class interfacess {
    public static void main(String args[]) {
        Queen q=new Queen();
        Rook r=new Rook();
        Bishop b=new Bishop();
        q.moves();
        r.moves();
        b.moves();
    }
    
}
interface Chessplayer {
    void moves();
}
class Queen implements Chessplayer {
    public void moves() {
        System.out.println("up,down,diag,left,rig");
    }
}
class Rook implements Chessplayer {
    public void moves() {
        System.out.println("up,down,left,rig");
    }
}
class Bishop implements Chessplayer {
    public void moves() {
        System.out.println("diag");
    }
}
