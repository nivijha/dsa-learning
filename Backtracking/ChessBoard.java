package Backtracking;

public class ChessBoard {
    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    /* public static void nQueens(char board[][], int row){
        //base
        if(row==board.length){
            //printBoard(board);
            count++;
            return;
        }
        //column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';//Queen jo baithaya hr row mei board ke
                nQueens(board, row+1);
                board[row][j]='x';//backtracking krte Queen ki position change krne ke liye uss position se hta diya
            }
        }
    } */

    //to print 1 Solution
    public static boolean nQueens(char board[][], int row){
        //base
        if(row==board.length){
            //printBoard(board);
            count++;
            return true;
        }
        //column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';//Queen jo baithaya hr row mei board ke
                if(nQueens(board, row+1)){
                    return true;
                };
                board[row][j]='x';//backtracking krte Queen ki position change krne ke liye uss position se hta diya
            }
        }
        return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("---------Chess Board-----------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    static int count=0;
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='x';
            }
        }
        //nQueens(board, 0);

        if(nQueens(board, 0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }
        else{
            System.out.println("solution not possible");
        }
        //System.out.println("total ways to place queens= "+ count);
    }
}
