package Array2D;

public class Q3 {
    public static void trans(int matrix[][]){
        int row=0, col=matrix[0].length;
        int transpose[][]= new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i]=matrix[i][j];
            }
            
        }
    }
    public static void main(String[] args) {
        int martix[][]={{1,2,3},
                        {4,5,6}};
    }
}
