public class Interfaces {
    public static void main(String[] args) {
        
    }    
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(in all directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(by one step)");
    }
}